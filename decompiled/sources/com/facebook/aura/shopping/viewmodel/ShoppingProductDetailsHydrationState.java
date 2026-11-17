package com.facebook.aura.shopping.viewmodel;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsHydrationState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ShoppingProductDetailsHydrationState[] $VALUES;
    public static final ShoppingProductDetailsHydrationState FAILED;
    public static final ShoppingProductDetailsHydrationState HYDRATING;
    public static final ShoppingProductDetailsHydrationState LOADED;
    public static final ShoppingProductDetailsHydrationState UNAVAILABLE;

    static {
        ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState = new ShoppingProductDetailsHydrationState("HYDRATING", 0);
        HYDRATING = shoppingProductDetailsHydrationState;
        ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState2 = new ShoppingProductDetailsHydrationState("LOADED", 1);
        LOADED = shoppingProductDetailsHydrationState2;
        ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState3 = new ShoppingProductDetailsHydrationState(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = shoppingProductDetailsHydrationState3;
        ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState4 = new ShoppingProductDetailsHydrationState("UNAVAILABLE", 3);
        UNAVAILABLE = shoppingProductDetailsHydrationState4;
        ShoppingProductDetailsHydrationState[] shoppingProductDetailsHydrationStateArr = {shoppingProductDetailsHydrationState, shoppingProductDetailsHydrationState2, shoppingProductDetailsHydrationState3, shoppingProductDetailsHydrationState4};
        $VALUES = shoppingProductDetailsHydrationStateArr;
        $ENTRIES = C3cG.A0w(shoppingProductDetailsHydrationStateArr);
    }

    public static Ey9<ShoppingProductDetailsHydrationState> getEntries() {
        return $ENTRIES;
    }

    public static ShoppingProductDetailsHydrationState valueOf(String str) {
        return (ShoppingProductDetailsHydrationState) Enum.valueOf(ShoppingProductDetailsHydrationState.class, str);
    }

    public static ShoppingProductDetailsHydrationState[] values() {
        return (ShoppingProductDetailsHydrationState[]) $VALUES.clone();
    }

    public ShoppingProductDetailsHydrationState(String str, int i) {
    }
}
