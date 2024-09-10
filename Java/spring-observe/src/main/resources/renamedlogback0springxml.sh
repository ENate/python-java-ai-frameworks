<!--  ?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <include resource="org/springframework/boot/logging/logback/base.xml"/>
    <springProperty scope="context" name="appName" source="spring.application.name"/>
    <springProperty scope="context" name="lokiUrl" source="loki.url"/>
    <springProperty scope="context" name="username" source="loki.user"/>
    <springProperty scope="context" name="password" source="loki.pass"/>

    <appender name="LOKI" class="com.github.loki4j.logback.Loki4jAppender">
        <batchMaxBytes>65536</batchMaxBytes>
        <http>
            <url>${lokiUrl}</url>
            <auth>
                <username>${username}</username>
                <password>${password}</password>
            </auth>
            <requestTimeoutMs>15000</requestTimeoutMs>
        </http>
        <format>
            <label>
                <pattern>application=${appName},host=${HOSTNAME},level=%level</pattern>
            </label>
            <message>
                <pattern>${FILE_LOG_PATTERN}</pattern>
            </message>
            <sortByTime>true</sortByTime>
        </format>
    </appender>

    <root level="INFO">
        <appender-ref ref="LOKI"/>
    </root>
</configuration-->