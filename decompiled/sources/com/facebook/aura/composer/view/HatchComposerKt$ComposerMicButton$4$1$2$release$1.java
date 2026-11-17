package com.facebook.aura.composer.view;

import X.AbstractC07117nq;
import X.C1247Afe;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$4$1$2$release$1", f = "HatchComposer.kt", l = {1579, 1580}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerMicButton$4$1$2$release$1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super C1247Afe>, Object> {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    public HatchComposerKt$ComposerMicButton$4$1$2$release$1(HtJ<? super HatchComposerKt$ComposerMicButton$4$1$2$release$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchComposerKt$ComposerMicButton$4$1$2$release$1 hatchComposerKt$ComposerMicButton$4$1$2$release$1 = new HatchComposerKt$ComposerMicButton$4$1$2$release$1(htJ);
        hatchComposerKt$ComposerMicButton$4$1$2$release$1.L$0 = obj;
        return hatchComposerKt$ComposerMicButton$4$1$2$release$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0043 -> B:7:0x0014). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r5 = r6.L$0
            X.AXb r5 = (X.InterfaceC1074AXb) r5
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r3 = 2
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L46
            if (r1 == r0) goto L56
            if (r1 != r3) goto L5c
            X.Hwg.A00(r7)
        L14:
            X.Afe r7 = (X.C1247Afe) r7
        L16:
            java.util.List<X.Agk> r1 = r7.A05
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L23
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L23
        L22:
            return r7
        L23:
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            X.Agk r0 = (X.C1299Agk) r0
            boolean r0 = r0.A0F
            if (r0 == 0) goto L27
            r6.L$0 = r5
            r6.L$1 = r2
            r6.label = r3
            X.AXj r0 = X.EnumC1080AXj.A04
            java.lang.Object r7 = r5.A4z(r0, r6)
            if (r7 != r4) goto L14
            return r4
        L46:
            X.Hwg.A00(r7)
            r6.L$0 = r5
            r6.label = r0
            X.AXj r0 = X.EnumC1080AXj.A04
            java.lang.Object r7 = r5.A4z(r0, r6)
            if (r7 != r4) goto L59
            return r4
        L56:
            X.Hwg.A00(r7)
        L59:
            X.Afe r7 = (X.C1247Afe) r7
            goto L16
        L5c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$4$1$2$release$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super C1247Afe> htJ) {
        HatchComposerKt$ComposerMicButton$4$1$2$release$1 hatchComposerKt$ComposerMicButton$4$1$2$release$1 = new HatchComposerKt$ComposerMicButton$4$1$2$release$1(htJ);
        hatchComposerKt$ComposerMicButton$4$1$2$release$1.L$0 = interfaceC1074AXb;
        return hatchComposerKt$ComposerMicButton$4$1$2$release$1.invokeSuspend(Unit.INSTANCE);
    }
}
