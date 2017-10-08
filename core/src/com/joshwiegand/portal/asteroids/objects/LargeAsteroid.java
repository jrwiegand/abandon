package com.joshwiegand.portal.asteroids.objects;

import com.joshwiegand.portal.asteroids.util.Assets;

public class LargeAsteroid extends Asteroid {

    public static final float SIZE = 64;

    private static final int HITS = 3;

    public LargeAsteroid(float x, float y, float vX, float vY) {
        super(Assets.LARGE_ASTEROID, x, y, SIZE, vX, vY, HITS);
    }
}
