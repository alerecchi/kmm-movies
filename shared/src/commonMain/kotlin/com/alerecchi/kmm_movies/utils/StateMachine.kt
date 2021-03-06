package com.alerecchi.kmm_movies.utils

interface StateMachine <STATE, ACTION> {

    suspend fun handleAction(action: ACTION)

    suspend fun reducer(state: STATE, action: ACTION): STATE
}