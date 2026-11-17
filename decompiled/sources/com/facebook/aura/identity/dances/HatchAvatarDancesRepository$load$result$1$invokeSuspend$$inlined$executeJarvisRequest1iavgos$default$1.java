package com.facebook.aura.identity.dances;

import X.AbstractC7559F3s;
import X.BFU;
import X.C07107nn;
import X.C07959pz;
import X.C3cG;
import X.C79;
import X.C7nl;
import X.C9hr;
import X.C9u8;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;

/* renamed from: com.facebook.aura.identity.dances.HatchAvatarDancesRepository$load$result$1$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class HatchAvatarDancesRepository$load$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends JsonElement>>> {
    public static final HatchAvatarDancesRepository$load$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new HatchAvatarDancesRepository$load$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1();

    public HatchAvatarDancesRepository$load$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends JsonElement>> invoke() {
        C07959pz c07959pz = HatchJsonKt.HatchJson.A02;
        C07107nn c07107nn = new C07107nn(C79.A00, C7nl.A00(JsonElement.class));
        return C9u8.A03(new BFU(Collections.singletonList(c07107nn), C3cG.A0x(List.class)), c07959pz);
    }
}
