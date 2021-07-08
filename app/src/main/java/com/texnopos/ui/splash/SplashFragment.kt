package com.texnopos.ui.splash

import android.animation.Animator
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.texnopos.instagram.R
import com.texnopos.instagram.databinding.FragmentSplashBinding
import com.texnopos.instagram.data.Settings

class SplashFragment : Fragment(R.layout.fragment_splash) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        lateinit var binding : FragmentSplashBinding
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashBinding.bind(view)
        requireActivity().actionBar?.hide()
        binding.lottieView.setMaxProgress(0.6f)
        val settings = Settings(requireContext())
        binding.lottieView.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationEnd(animation: Animator?) {
                if(settings.signedIn){

                }else {

                }
            }

            override fun onAnimationCancel(animation: Animator?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationRepeat(animation: Animator?) {
                TODO("Not yet implemented")
            }
        })
    }
}