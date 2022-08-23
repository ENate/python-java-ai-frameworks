""" Implement merge sort """
def merge_sort(inp_arr):
    """ merge sorting """
    size = len(inp_arr)
    if size > 1:
        middle = size // 2
        left_arr = inp_arr[:middle]
        right_arr = inp_arr[middle:]

        merge_sort(left_arr)
        merge_sort(right_arr)

        p_idx = 0
        q_idx = 0
        r_idx = 0

        left_size = len(left_arr)
        right_size = len(right_arr)
        while p_idx < left_size and q_idx < right_size:
            if left_arr[p_idx] < right_arr[q_idx]:
                inp_arr[r_idx] = left_arr[p_idx]
                p_idx += 1
            else:
                inp_arr[r_idx] = right_arr[q_idx]
                q_idx += 1
            r_idx += 1

        while p_idx < left_size:
            inp_arr[r_idx] = left_arr[p_idx]
            p_idx += 1
            r_idx += 1

        while q_idx < right_size:
            inp_arr[r_idx] = right_arr[q_idx]
            q_idx += 1
            r_idx += 1


if __name__ == "__main__":
    INP_ARR = [112, 41, 0, 9, 5, 101, 56, 77, 2]
    print("Input Array:\n")
    print(INP_ARR)
    merge_sort(INP_ARR)
    print("Sorted Array:\n")
    print(INP_ARR)
