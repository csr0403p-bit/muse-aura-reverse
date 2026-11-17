package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import X.HsK;

/* loaded from: classes.dex */
public final class MarketStockItem extends C06G {
    public final double change;
    public final double changePercent;
    public final String name;
    public final double price;
    public final String symbol;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketStockItem) {
                MarketStockItem marketStockItem = (MarketStockItem) obj;
                if (!C7384Etj.areEqual(this.symbol, marketStockItem.symbol) || !C7384Etj.areEqual(this.name, marketStockItem.name) || Double.compare(this.price, marketStockItem.price) != 0 || Double.compare(this.change, marketStockItem.change) != 0 || Double.compare(this.changePercent, marketStockItem.changePercent) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MarketStockItem copy$default(MarketStockItem marketStockItem, String str, String str2, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketStockItem.symbol;
        }
        if ((i & 2) != 0) {
            str2 = marketStockItem.name;
        }
        if ((i & 4) != 0) {
            d = marketStockItem.price;
        }
        if ((i & 8) != 0) {
            d2 = marketStockItem.change;
        }
        if ((i & 16) != 0) {
            d3 = marketStockItem.changePercent;
        }
        return marketStockItem.copy(str, str2, d, d2, d3);
    }

    public final String component1() {
        return this.symbol;
    }

    public final String component2() {
        return this.name;
    }

    public final double component3() {
        return this.price;
    }

    public final double component4() {
        return this.change;
    }

    public final double component5() {
        return this.changePercent;
    }

    public final double getChange() {
        return this.change;
    }

    public final double getChangePercent() {
        return this.changePercent;
    }

    public final String getName() {
        return this.name;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.symbol)) + HsK.A00(this.price)) * 31) + HsK.A00(this.change)) * 31) + HsK.A00(this.changePercent);
    }

    public MarketStockItem(String str, String str2, double d, double d2, double d3) {
        AnonymousClass003.A0u(str, str2);
        this.symbol = str;
        this.name = str2;
        this.price = d;
        this.change = d2;
        this.changePercent = d3;
    }

    public final MarketStockItem copy(String str, String str2, double d, double d2, double d3) {
        AnonymousClass003.A0u(str, str2);
        return new MarketStockItem(str, str2, d, d2, d3);
    }

    public String toString() {
        return super.toString();
    }
}
