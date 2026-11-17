package com.facebook.aura.vds.compose.common;

import X.AbstractC2139Az7;
import X.AnonymousClass003;
import X.AxM;
import X.BRg;
import X.InterfaceC1072AWd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraClickableCardKt {
    /* renamed from: auraClickableCard-YQRRFTQ$default, reason: not valid java name */
    public static /* synthetic */ BRg m2510auraClickableCardYQRRFTQ$default(BRg bRg, Function0 function0, Function0 function02, int i, InterfaceC1072AWd interfaceC1072AWd, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function02 = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            interfaceC1072AWd = null;
        }
        return m2509auraClickableCardYQRRFTQ(bRg, function0, function02, i, interfaceC1072AWd);
    }

    /* renamed from: auraClickableCard-YQRRFTQ, reason: not valid java name */
    public static final BRg m2509auraClickableCardYQRRFTQ(BRg bRg, Function0<Unit> function0, Function0<Unit> function02, int i, InterfaceC1072AWd interfaceC1072AWd) {
        AnonymousClass003.A0u(bRg, function0);
        return AxM.A02(bRg, AbstractC2139Az7.A00, new AuraClickableCardKt$auraClickableCard$1(function0, function02, interfaceC1072AWd, i));
    }
}
