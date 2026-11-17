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
public final class ShoppingFormat {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ShoppingFormat[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final ShoppingFormat CHIP;
    public static final Companion Companion;
    public static final ShoppingFormat GRID;
    public static final ShoppingFormat LIGHTBOX;
    public static final ShoppingFormat LIST;
    public static final ShoppingFormat MAP;
    public static final ShoppingFormat RELATED_RAIL;
    public static final ShoppingFormat SELLER_RAIL;
    public final String value;

    public final class Companion {

        /* renamed from: com.facebook.aura.shopping.model.ShoppingFormat$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.shopping.model.ShoppingFormat", ShoppingFormat.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(ShoppingFormat.$cachedSerializer$delegate);
        }

        public final C9hr<ShoppingFormat> serializer() {
            return AnonymousClass001.A12(ShoppingFormat.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ShoppingFormat shoppingFormat = new ShoppingFormat("CHIP", 0, "chip");
        CHIP = shoppingFormat;
        ShoppingFormat shoppingFormat2 = new ShoppingFormat("LIST", 1, "list");
        LIST = shoppingFormat2;
        ShoppingFormat shoppingFormat3 = new ShoppingFormat("GRID", 2, "grid");
        GRID = shoppingFormat3;
        ShoppingFormat shoppingFormat4 = new ShoppingFormat("RELATED_RAIL", 3, "related_rail");
        RELATED_RAIL = shoppingFormat4;
        ShoppingFormat shoppingFormat5 = new ShoppingFormat("SELLER_RAIL", 4, "seller_rail");
        SELLER_RAIL = shoppingFormat5;
        ShoppingFormat shoppingFormat6 = new ShoppingFormat("MAP", 5, "map");
        MAP = shoppingFormat6;
        ShoppingFormat shoppingFormat7 = new ShoppingFormat("LIGHTBOX", 6, "lightbox");
        LIGHTBOX = shoppingFormat7;
        ShoppingFormat[] shoppingFormatArr = {shoppingFormat, shoppingFormat2, shoppingFormat3, shoppingFormat4, shoppingFormat5, shoppingFormat6, shoppingFormat7};
        $VALUES = shoppingFormatArr;
        $ENTRIES = C3cG.A0w(shoppingFormatArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<ShoppingFormat> getEntries() {
        return $ENTRIES;
    }

    public static ShoppingFormat valueOf(String str) {
        return (ShoppingFormat) Enum.valueOf(ShoppingFormat.class, str);
    }

    public static ShoppingFormat[] values() {
        return (ShoppingFormat[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public ShoppingFormat(String str, int i, String str2) {
        this.value = str2;
    }
}
