package com.instagram.socialapp;

import com.instagram.socialapp.post.ContentPost;
import com.instagram.socialapp.post.photo.PhotoPost;
import com.instagram.socialapp.post.reel.ReelPost;


public class InstagramRunner {
    public static void main(String[] args) {

       ContentPost contentPost1 = new ReelPost();

        contentPost1.initializePost();
        contentPost1.uploadMetadata();
        contentPost1.checkCommunityGuidelines();
        contentPost1.compressMedia();
        contentPost1.publishToFeed();
        contentPost1.renderLayout();
        contentPost1.playAudio();
        contentPost1.configureAnalytics();
        contentPost1.archivePost();

        System.out.println("----------------------------------------");

        ContentPost contentPost2 = new PhotoPost();
        contentPost2.initializePost();
        contentPost2.uploadMetadata();
        contentPost2.checkCommunityGuidelines();
        contentPost2.compressMedia();
        contentPost2.publishToFeed();
        contentPost2.renderLayout();
        contentPost2.playAudio();
        contentPost2.configureAnalytics();
        contentPost2.archivePost();

    }
}
