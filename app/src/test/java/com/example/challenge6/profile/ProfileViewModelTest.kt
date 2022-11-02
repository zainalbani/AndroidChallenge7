package com.example.challenge6.profile

import com.example.challenge6.model.user.GetUserResponse
import com.example.challenge6.model.user.PostUserResponse
import com.example.challenge6.model.user.User
import com.example.challenge6.model.user.UserProfile
import com.example.challenge6.network.ApiServiceUser
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import retrofit2.Call

class ProfileViewModelTest {
    lateinit var service : ApiServiceUser
    lateinit var userProfile: UserProfile

    @Before
    fun setUp(){
        service = mockk()
    }

    @Test
    fun testGetUserById(){
        val id = 0
        val respGetUserById = mockk<Call<GetUserResponse>>()
        every{
            service.getUserById(id)
        } returns respGetUserById

        val result = service.getUserById(id)
            runBlocking {
                service.getUserById(id)
            }
            Assert.assertEquals(result, respGetUserById)
    }

}