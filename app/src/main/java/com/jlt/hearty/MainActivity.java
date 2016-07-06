package com.jlt.hearty;

import android.app.Activity;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

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

    private AnimatedVectorDrawable emptyHeartToBottom; // using an animated vector
    private AnimatedVectorDrawable fillHeartFromBottom; // using an animated vector

    /* ImageViews */

    @Bind( R.id.am_iv_heart )
    ImageView heartImageView; // the heart

    /* Primitives */

    private boolean heartFull; // tracks the fill of the heart

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

        emptyHeartToBottom = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_empty_to_bottom, null );
        fillHeartFromBottom = ( AnimatedVectorDrawable ) getResources().getDrawable( R.drawable.animated_vector_fill_from_bottom, null );

        // 4. start the heart empty

        heartFull = false;

    } // end onCreate

    /** Other Methods */

    // begin animateHeartBottom
    public void animateHeartBottom( View view ) {

        // 0. get the appropriate drawable based on heart status
        // 1. put gotten drawable in the image
        // 2. start the animation
        // 3. toggle heart status

        // 0. get the appropriate drawable based on heart status

        AnimatedVectorDrawable animatedVectorDrawable = ( heartFull == true ) ? emptyHeartToBottom : fillHeartFromBottom;

        // 1. put gotten drawable in the image

        heartImageView.setImageDrawable( animatedVectorDrawable );

        // 2. start the animation

        animatedVectorDrawable.start();

        // 3. toggle heart status

        heartFull = !heartFull;

    } // end animateHeartBottom

    /** INNER CLASSES */

} // end activity MainActivity