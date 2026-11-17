package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes4.dex */
public final class ShoppingProductType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ShoppingProductType[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final ShoppingProductType BROWSER;
    public static final ShoppingProductType CATALOG;
    public static final Companion Companion;
    public static final ShoppingProductType MARKETPLACE;
    public static final ShoppingProductType UNKNOWN;

    public final class Companion {

        /* renamed from: com.facebook.aura.shopping.model.ShoppingProductType$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.shopping.model.ShoppingProductType", ShoppingProductType.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(ShoppingProductType.$cachedSerializer$delegate);
        }

        public final C9hr<ShoppingProductType> serializer() {
            return AnonymousClass001.A12(ShoppingProductType.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ShoppingProductType shoppingProductType = new ShoppingProductType("CATALOG", 0);
        CATALOG = shoppingProductType;
        ShoppingProductType shoppingProductType2 = new ShoppingProductType("MARKETPLACE", 1);
        MARKETPLACE = shoppingProductType2;
        ShoppingProductType shoppingProductType3 = new ShoppingProductType("BROWSER", 2);
        BROWSER = shoppingProductType3;
        ShoppingProductType shoppingProductType4 = new ShoppingProductType("UNKNOWN", 3);
        UNKNOWN = shoppingProductType4;
        ShoppingProductType[] shoppingProductTypeArr = {shoppingProductType, shoppingProductType2, shoppingProductType3, shoppingProductType4};
        $VALUES = shoppingProductTypeArr;
        $ENTRIES = C3cG.A0w(shoppingProductTypeArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<ShoppingProductType> getEntries() {
        return $ENTRIES;
    }

    public static ShoppingProductType valueOf(String str) {
        return (ShoppingProductType) Enum.valueOf(ShoppingProductType.class, str);
    }

    public static ShoppingProductType[] values() {
        return (ShoppingProductType[]) $VALUES.clone();
    }

    public ShoppingProductType(String str, int i) {
    }
}
