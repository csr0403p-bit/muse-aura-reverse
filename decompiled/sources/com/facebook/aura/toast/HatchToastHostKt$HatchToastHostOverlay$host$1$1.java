package com.facebook.aura.toast;

import X.AnonymousClass003;
import X.C1BO;
import X.C9258GBl;
import X.InterfaceC10560Hsz;
import X.InterfaceC2261BLa;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchToastHostKt$HatchToastHostOverlay$host$1$1 implements HatchToastHost {
    public final /* synthetic */ C1BO<Function0<Boolean>> $currentAcceptsToasts$delegate;
    public final /* synthetic */ MutableState<InterfaceC10560Hsz<Unit>> $pendingDismiss$delegate;
    public final /* synthetic */ MutableState<AuraToast.ToastArgs> $visibleArgs$delegate;
    public final InterfaceC2261BLa showMutex = new C9258GBl();

    /* JADX WARN: Multi-variable type inference failed */
    public HatchToastHostKt$HatchToastHostOverlay$host$1$1(C1BO<? extends Function0<Boolean>> c1bo, MutableState<AuraToast.ToastArgs> mutableState, MutableState<InterfaceC10560Hsz<Unit>> mutableState2) {
        this.$currentAcceptsToasts$delegate = c1bo;
        this.$visibleArgs$delegate = mutableState;
        this.$pendingDismiss$delegate = mutableState2;
    }

    @Override // com.facebook.aura.toast.HatchToastHost
    public boolean getAcceptsToasts() {
        return AnonymousClass003.A1Y(C1BO.A0A(this.$currentAcceptsToasts$delegate));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #0 {all -> 0x00ba, blocks: (B:26:0x0098, B:28:0x00a2, B:32:0x00ac, B:34:0x00b6, B:35:0x00b9), top: B:41:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6 A[Catch: all -> 0x00ba, TryCatch #0 {all -> 0x00ba, blocks: (B:26:0x0098, B:28:0x00a2, B:32:0x00ac, B:34:0x00b6, B:35:0x00b9), top: B:41:0x001b }] */
    @Override // com.facebook.aura.toast.HatchToastHost
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object show(com.facebook.aura.vds.toast.AuraToast.ToastArgs r12, X.HtJ<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$1
            if (r0 == 0) goto L32
            r10 = r13
            com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$1 r10 = (com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L32
            int r2 = r2 - r1
            r10.label = r2
        L12:
            java.lang.Object r2 = r10.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r1 = r10.label
            r8 = 2
            r0 = 1
            r7 = 0
            if (r1 == 0) goto L57
            if (r1 == r0) goto L43
            if (r1 != r8) goto L3e
            java.lang.Object r6 = r10.L$3
            androidx.compose.runtime.MutableState r6 = (androidx.compose.runtime.MutableState) r6
            java.lang.Object r5 = r10.L$2
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            java.lang.Object r4 = r10.L$1
            X.BLa r4 = (X.InterfaceC2261BLa) r4
            java.lang.Object r12 = r10.L$0
            com.facebook.aura.vds.toast.AuraToast$ToastArgs r12 = (com.facebook.aura.vds.toast.AuraToast.ToastArgs) r12
            goto L38
        L32:
            com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$1 r10 = new com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$1
            r10.<init>(r11, r13)
            goto L12
        L38:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L3c
            goto L98
        L3c:
            r1 = move-exception
            goto Lac
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L43:
            java.lang.Object r6 = r10.L$3
            androidx.compose.runtime.MutableState r6 = (androidx.compose.runtime.MutableState) r6
            java.lang.Object r5 = r10.L$2
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            java.lang.Object r4 = r10.L$1
            X.BLa r4 = (X.InterfaceC2261BLa) r4
            java.lang.Object r12 = r10.L$0
            com.facebook.aura.vds.toast.AuraToast$ToastArgs r12 = (com.facebook.aura.vds.toast.AuraToast.ToastArgs) r12
            X.Hwg.A00(r2)
            goto L71
        L57:
            X.Hwg.A00(r2)
            X.BLa r4 = r11.showMutex
            androidx.compose.runtime.MutableState<com.facebook.aura.vds.toast.AuraToast$ToastArgs> r5 = r11.$visibleArgs$delegate
            androidx.compose.runtime.MutableState<X.Hsz<kotlin.Unit>> r6 = r11.$pendingDismiss$delegate
            r10.L$0 = r12
            r10.L$1 = r4
            r10.L$2 = r5
            r10.L$3 = r6
            r10.label = r0
            java.lang.Object r0 = r4.APs(r7, r10)
            if (r0 != r9) goto L71
            return r9
        L71:
            X.GAt r3 = new X.GAt     // Catch: java.lang.Throwable -> Lbc
            r3.<init>(r7)     // Catch: java.lang.Throwable -> Lbc
            r5.Af8(r12)     // Catch: java.lang.Throwable -> Lbc
            r6.Af8(r3)     // Catch: java.lang.Throwable -> Lbc
            long r1 = com.facebook.aura.toast.HatchToastHostKt.durationMs(r12)     // Catch: java.lang.Throwable -> Lab
            com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$2$1 r0 = new com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$2$1     // Catch: java.lang.Throwable -> Lab
            r0.<init>(r3, r7)     // Catch: java.lang.Throwable -> Lab
            r10.L$0 = r12     // Catch: java.lang.Throwable -> Lab
            r10.L$1 = r4     // Catch: java.lang.Throwable -> Lab
            r10.L$2 = r5     // Catch: java.lang.Throwable -> Lab
            r10.L$3 = r6     // Catch: java.lang.Throwable -> Lab
            r10.L$4 = r7     // Catch: java.lang.Throwable -> Lab
            r10.label = r8     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r0 = X.GAX.A01(r10, r0, r1)     // Catch: java.lang.Throwable -> Lab
            if (r0 != r9) goto L98
            return r9
        L98:
            r5.Af8(r7)     // Catch: java.lang.Throwable -> Lba
            r6.Af8(r7)     // Catch: java.lang.Throwable -> Lba
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r12.onDismiss     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto La5
            r0.invoke()     // Catch: java.lang.Throwable -> Lba
        La5:
            r4.Ahe(r7)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lab:
            r1 = move-exception
        Lac:
            r5.Af8(r7)     // Catch: java.lang.Throwable -> Lba
            r6.Af8(r7)     // Catch: java.lang.Throwable -> Lba
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r12.onDismiss     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto Lb9
            r0.invoke()     // Catch: java.lang.Throwable -> Lba
        Lb9:
            throw r1     // Catch: java.lang.Throwable -> Lba
        Lba:
            r0 = move-exception
            goto Lbd
        Lbc:
            r0 = move-exception
        Lbd:
            r4.Ahe(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$host$1$1.show(com.facebook.aura.vds.toast.AuraToast$ToastArgs, X.HtJ):java.lang.Object");
    }
}
