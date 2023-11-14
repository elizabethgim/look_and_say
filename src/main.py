
def look_and_say(number):
    N = len(str(number))
    prev = str(number)[0]
    cnt = 0
    answer = ""

    if N == 1:
        answer += str(1)+prev
        return int(answer)

    for i in range(N-1):
        if prev == str(number)[i]:
            cnt += 1
        else:
            answer += str(cnt)+str(prev)

            prev = str(number)[i]
            cnt = 1

    if prev == str(number)[-1]:
        cnt += 1
        answer += str(cnt) + str(prev)
    else:
        answer += str(cnt)+str(prev)
        answer += str(1)+str(number)[-1]

    return int(answer)

