package com.jlt.hearty;

import android.app.Activity;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Hearty
 * <p/>
 * Simple demonstration of Android vector clip path capabilities
 * <p/>
 * Copyright (C) 2016 Kairu Joshua Wambugu
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */

// begin activity MainActivity
public class MainActivity extends Activity {

    /** CONSTANTS */

    /** VARIABLES */

    /* Animated Vector Drawables */

    private AnimatedVectorDrawable emptyHeartToTopLeft; // using an animated vector
    private AnimatedVectorDrawable fillHeartFromTopLeft; // using an animated vector

    private AnimatedVectorDrawable emptyHeartToTop; // using an animated vector
    private AnimatedVectorDrawable fillHeartFromTop; // using an animated vector

    private AnimatedVectorDrawable emptyHeartToTopRight; // using an animated vector
    private AnimatedVectorDrawable fillHeartFromTopRight; // using an animated vector

    private AnimatedVectorDrawable emptyHeartToRight; // using an animated vector
    private AnimatedVectorDrawable fillHeartFromRight; // using an animated vector

    private AnimatedVectorDrawable emptyHeartToBottomRight; // using an animated vector
    private AnimatedVectorDrawable fillHeartFromBottomRight; // using an animated vector

    private AnimatedVectorDrawable emptyHeartToBottom; // using an animated vector
    private AnimatedVectorDrawable fillHeartFromBottom; // using an animated vector

    private AnimatedVectorDrawable emptyHeartToBottomLeft; // using an animated vector
    private AnimatedVectorDrawable fillHeartFromBottomLeft; // using an animated vector

    private AnimatedVectorDrawable emptyHeartToLeft; // using an animated vector
    private AnimatedVectorDrawable fillHeartFromLeft; // using an animated vector

    /* Image Buttons */

    @Bind( R.id.am_ib_top_left )
    ImageButton topLeftButton;

    @Bind( R.id.am_ib_top )
    ImageButton topButton;

    @Bind( R.id.am_ib_top_right )
    ImageButton topRightButton;

    @Bind( R.id.am_ib_right )
    ImageButton rightButton;

    @Bind( R.id.am_ib_bottom_right )
    ImageButton bottomRightButton;

    @Bind( R.id.am_ib_bottom )
    ImageButton bottomButton;

    @Bind( R.id.am_ib_bottom_left )
    ImageButton bottomLeftButton;

    @Bind( R.id.am_ib_left )
    ImageButton leftButton;

    /* Image Views */

    @Bind( R.id.am_iv_heart )
    ImageView heartImageView; // the heart

    /* Primitives */

    private boolean heartFull; // tracks the fill of the heart

    /* Vector Drawables */
    
    private VectorDrawable topLeftHeartVectorDrawable; // for animating via top left
    private VectorDrawable topHeartVectorDrawable; // for animating via top
    private VectorDrawable topRightHeartVectorDrawable; // for animating via top right
    private VectorDrawable rightHeartVectorDrawable; // for animating via right
    private VectorDrawable bottomRightHeartVectorDrawable; // for animating via bottom right
    private VectorDrawable bottomHeartVectorDrawable; // for animating via bottom
    private VectorDrawable bottomLeftHeartVectorDrawable; // for animating via bottom left
    private VectorDrawable leftHeartVectorDrawable; // for animating via left
    
    /** METHODS */

    /** Getters and Setters */

    /**
     * Overrides
     */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super things
        // 1. use the main layout
        // 2. bind views
        // 3. initialize the animation vectors
        // 4. start the heart empty

        // 0. super things

        super.onCreate( savedInstanceState );

        // 1. use the main layout

        setContentView( R.layout.activity_main );

        // 2. bind views

        ButterKnife.bind( this );
//        heartImageView = ( ImageView ) findViewById( R.id.am_iv_heart );

        // 3. initialize the animation vectors

        emptyHeartToTopLeft = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_empty_to_top_left, null );
        fillHeartFromTopLeft = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_fill_from_top_left, null );

        emptyHeartToTop = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_empty_to_top, null );
        fillHeartFromTop = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_fill_from_top, null );

        emptyHeartToTopRight = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_empty_to_top_right, null );
        fillHeartFromTopRight = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_fill_from_top_right, null );

        emptyHeartToRight = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_empty_to_right, null );
        fillHeartFromRight = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_fill_from_right, null );

        emptyHeartToBottomRight = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_empty_to_bottom_right, null );
        fillHeartFromBottomRight = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_fill_from_bottom_right, null );

        emptyHeartToBottom = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_empty_to_bottom, null );
        fillHeartFromBottom = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_fill_from_bottom, null );

        emptyHeartToBottomLeft = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_empty_to_bottom_left, null );
        fillHeartFromBottomLeft = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_fill_from_bottom_left, null );

        emptyHeartToLeft = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_empty_to_left, null );
        fillHeartFromLeft = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_fill_from_left, null );

        // 4. start the heart empty

        heartFull = false;

    } // end onCreate

    /** Other Methods */

    @OnClick(
            {
                    R.id.am_ib_top_left,
                    R.id.am_ib_top,
                    R.id.am_ib_top_right,
                    R.id.am_ib_right,
                    R.id.am_ib_bottom_right,
                    R.id.am_ib_bottom,
                    R.id.am_ib_bottom_left,
                    R.id.am_ib_left
            }
    )
    // begin method onButtonClick
    void onButtonClick( View view ) {

        // 0. determine which button has been clicked
        // 1. animate the heart in that button's direction

        // 0. determine which button has been clicked

        // begin switching the view
        switch ( view.getId() ) {

            // 1. animate the heart in that button's direction

            case R.id.am_ib_top_left:

                animateHeart( emptyHeartToTopLeft, fillHeartFromTopLeft );

                break;

            case R.id.am_ib_top:

                animateHeart( emptyHeartToTop, fillHeartFromTop );

                break;

            case R.id.am_ib_top_right:

                animateHeart( emptyHeartToTopRight, fillHeartFromTopRight );

                break;

            case R.id.am_ib_right:

                animateHeart( emptyHeartToRight, fillHeartFromRight );

                break;

            case R.id.am_ib_bottom_right:

                animateHeart( emptyHeartToBottomRight, fillHeartFromBottomRight );

                break;

            case R.id.am_ib_bottom:

                animateHeart( emptyHeartToBottom, fillHeartFromBottom );

                break;

            case R.id.am_ib_bottom_left:

                animateHeart( emptyHeartToBottomLeft, fillHeartFromBottomLeft );

                break;

            case R.id.am_ib_left:

                animateHeart( emptyHeartToLeft, fillHeartFromLeft );

                break;

        } // end switching the view

    } // end method onButtonClick

    // begin animateHeart
    public void animateHeart( AnimatedVectorDrawable emptyHeart, AnimatedVectorDrawable fillHeart ) {

        // 0. get the appropriate drawable based on heart status
        // 1. put gotten drawable in the image
        // 2. start the animation
        // 3. toggle heart status

        // 0. get the appropriate drawable based on heart status

        AnimatedVectorDrawable animatedVectorDrawable = ( heartFull == true ) ? emptyHeart : fillHeart;

        // 1. put gotten drawable in the image

        heartImageView.setImageDrawable( animatedVectorDrawable );

        // 2. start the animation

        animatedVectorDrawable.start();

        // 3. toggle heart status

        heartFull = !heartFull;

    } // end animateHeart

    /** INNER CLASSES */

} // end activity MainActivity