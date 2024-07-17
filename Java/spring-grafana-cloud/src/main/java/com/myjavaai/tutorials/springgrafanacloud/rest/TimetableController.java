package com.myjavaai.tutorials.springgrafanacloud.rest;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myjavaai.tutorials.springgrafanacloud.domain.Timetable;

import ai.timefold.solver.core.api.solver.SolverJob;
import ai.timefold.solver.core.api.solver.SolverManager;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/timetable")
public class TimetableController {

    private SolverManager<Timetable, UUID> solverManager;

    public TimetableController(SolverManager<Timetable, UUID> solverManager) {
        this.solverManager = solverManager;
    }

    @PostMapping("/solve")
    public Timetable solve(@RequestBody Timetable problem) {
        UUID problemId = UUID.randomUUID();
        // Submit the problem to start solving
        SolverJob<Timetable, UUID> solverJob = solverManager.solve(problemId, problem);
        Timetable solution;
        try {
            // Wait until the solving ends
            solution = solverJob.getFinalBestSolution();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("Solving failed.", e);
        }
        return solution;
    }

}
