package com.Movie.ShoutReview.controller;

import com.Movie.ShoutReview.domain.Review;

import com.Movie.ShoutReview.services.ReviewService;
import com.Movie.ShoutReview.services.request.ReviewRequest;
import com.Movie.ShoutReview.services.response.ReviewResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/add")
    public void addReview(@RequestBody ReviewRequest reviewRequest){
        reviewService.addReview(reviewRequest.toReview());
    }

    @GetMapping("/find")
    public ReviewResponse getReview(@RequestParam Long reviewId){
        return reviewService.getReviewById(reviewId);
    }
}
