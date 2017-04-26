/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.support.android.designlibdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ImagenesCase {





    private static final Random RANDOM = new Random();

    public static int getRandomCheeseDrawable() {
        switch (RANDOM.nextInt(8)) {
            default:
            case 0:
                return R.drawable.restaurantes;
            case 1:
                return R.drawable.hoteles;
            case 2:
                return R.drawable.extremoss;
            case 3:
                return R.drawable.clubesnocturnos;
            case 4:
                return R.drawable.teatros;
            case 5:
                return R.drawable.cine;
            case 6:
                return R.drawable.transporte;
            case 7:
                return R.drawable.museos;
            case 8:
                return R.drawable.parques;
        }
    }



    public static int getRandomCheese(){
        /*switch (RANDOM.nextInt(10)) {
            default:
            case 0:
                return R.drawable.restaurantes;
            case 1:
                return R.drawable.hoteles;
            case 2:
                return R.drawable.extremoss;
            case 3:
                return R.drawable.cine;
            case 4:
                return R.drawable.clubesnocturnos;
            case 5:
                return R.drawable.teatros;
            case 6:
                return R.drawable.transporte;
            case 7:
                return R.drawable.museos;
            case 8:
                return R.drawable.parques;
        }*/
        return R.drawable.hoteles;
    }






    public static final String[] Categorias = { "Hoteles",//"Restaurantes","Clubes Nocturnos","Parques"
            //,"Museos","Teatros","Cines","Diversos","Transporte"


    };

}
