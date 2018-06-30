####################################################
# time 4:44pm                                      #
# Internship period programming practice           #
# Kadanes Algo to find maxium sum of a sub array   #
####################################################

######################################################################
#Logic: have 2 variables one for current max and other global max    #
#       current max is maxium sum of sub-array till the current index#
#        check with global max and update                            #
######################################################################

def kanades_algo(A):
    max_current=A[0]
    max_global=A[0]
    for i in range(1,len(A)):
        max_current=max(A[i],A[i]+max_current)
        if max_current>max_global:
            max_global=max_current
    return max_global

answer=kanades_algo([-2,3,2,-1])
print(answer)
