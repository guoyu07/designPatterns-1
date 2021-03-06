/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.builder;

/**
 * @author Yue Chang
 * @ClassName: AbstractNutritionFactsBuilder
 * @Description: 抽象建造者类
 * @date 2017/6/8 19:58
 */
public abstract class AbstractNutritionFactsBuilder {


    abstract NutritionFactsBuilder calories(int val);

    abstract NutritionFactsBuilder fat(int val);

    abstract NutritionFactsBuilder carbohydrate(int val);

    abstract NutritionFactsBuilder sodium(int val);

    abstract NutritionFacts build();
}
