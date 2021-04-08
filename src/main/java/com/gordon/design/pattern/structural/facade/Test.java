package com.gordon.design.pattern.structural.facade;

/**
 * Created by gordon
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
