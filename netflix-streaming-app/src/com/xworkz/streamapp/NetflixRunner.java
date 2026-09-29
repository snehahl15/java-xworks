package com.xworkz.streamapp;

import com.xworkz.streamapp.subscription.UserPlan;
import com.xworkz.streamapp.subscription.basic.MobileOnlyPlan;
import com.xworkz.streamapp.subscription.premium.UltraHDPlan;

public class NetflixRunner {
    public static void main(String[] args) {
        UserPlan userPlan1 = new UltraHDPlan();
        userPlan1.validateCredentials();
        userPlan1.checkConcurrentScreens();
        userPlan1.fetchRecommendationAlgo();
        userPlan1.loadVideoBuffer();
        userPlan1.verifyAgeRestriction();
        userPlan1.setStreamingResolution();
        userPlan1.loadAudioTracks();
        userPlan1.displaySubtitles();
        userPlan1.updateWatchHistory();
        System.out.println("----------------------------------------");

        UserPlan userPlan2 = new MobileOnlyPlan();
        userPlan2.validateCredentials();
        userPlan2.checkConcurrentScreens();
        userPlan2.fetchRecommendationAlgo();
        userPlan2.loadVideoBuffer();
        userPlan2.verifyAgeRestriction();
        userPlan2.setStreamingResolution();
        userPlan2.loadAudioTracks();
        userPlan2.displaySubtitles();
        userPlan2.updateWatchHistory();
        System.out.println("----------------------------------------");

    }
}
