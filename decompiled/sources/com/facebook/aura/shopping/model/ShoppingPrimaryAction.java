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
public final class ShoppingPrimaryAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ShoppingPrimaryAction[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final ShoppingPrimaryAction ADD_TO_CART;
    public static final Companion Companion;
    public static final ShoppingPrimaryAction UNSUPPORTED;

    public final class Companion {

        /* renamed from: com.facebook.aura.shopping.model.ShoppingPrimaryAction$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.shopping.model.ShoppingPrimaryAction", ShoppingPrimaryAction.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(ShoppingPrimaryAction.$cachedSerializer$delegate);
        }

        public final C9hr<ShoppingPrimaryAction> serializer() {
            return AnonymousClass001.A12(ShoppingPrimaryAction.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ShoppingPrimaryAction shoppingPrimaryAction = new ShoppingPrimaryAction("ADD_TO_CART", 0);
        ADD_TO_CART = shoppingPrimaryAction;
        ShoppingPrimaryAction shoppingPrimaryAction2 = new ShoppingPrimaryAction("UNSUPPORTED", 1);
        UNSUPPORTED = shoppingPrimaryAction2;
        ShoppingPrimaryAction[] shoppingPrimaryActionArr = {shoppingPrimaryAction, shoppingPrimaryAction2};
        $VALUES = shoppingPrimaryActionArr;
        $ENTRIES = C3cG.A0w(shoppingPrimaryActionArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<ShoppingPrimaryAction> getEntries() {
        return $ENTRIES;
    }

    public static ShoppingPrimaryAction valueOf(String str) {
        return (ShoppingPrimaryAction) Enum.valueOf(ShoppingPrimaryAction.class, str);
    }

    public static ShoppingPrimaryAction[] values() {
        return (ShoppingPrimaryAction[]) $VALUES.clone();
    }

    public ShoppingPrimaryAction(String str, int i) {
    }
}
