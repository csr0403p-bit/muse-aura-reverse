package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.C3UX;
import X.G0V;
import X.HtJ;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$2$1", f = "FileViewerScreen.kt", l = {224}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<SlideState> $slideState$delegate;
    public final /* synthetic */ List<SlideInfo> $slidesInfo;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$2$1(List<SlideInfo> list, MutableState<SlideState> mutableState, AbstractC3358CGz abstractC3358CGz, HtJ<? super FileViewerScreenKt$FileViewerScreen$2$1> htJ) {
        super(2, htJ);
        this.$slidesInfo = list;
        this.$slideState$delegate = mutableState;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FileViewerScreenKt$FileViewerScreen$2$1(this.$slidesInfo, this.$slideState$delegate, this.$userSession, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:6:0x001c). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r5 = 1
            if (r0 == 0) goto L8f
            if (r0 != r5) goto Lb3
            int r2 = r11.I$1
            int r9 = r11.I$0
            java.lang.Object r4 = r11.L$4
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r8 = r11.L$3
            androidx.compose.runtime.MutableState r8 = (androidx.compose.runtime.MutableState) r8
            java.lang.Object r7 = r11.L$2
            X.CGz r7 = (X.AbstractC3358CGz) r7
            X.Hwg.A00(r12)
        L1c:
            if (r12 == 0) goto L40
            java.lang.Object r10 = r8.getValue()
            com.facebook.aura.file.view.SlideState r10 = (com.facebook.aura.file.view.SlideState) r10
            java.lang.Object r0 = r8.getValue()
            com.facebook.aura.file.view.SlideState r0 = (com.facebook.aura.file.view.SlideState) r0
            X.AJp<java.lang.Integer, java.lang.String> r1 = r0.htmlCache
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            X.AJp r3 = r1.AYj(r0, r12)
            boolean r1 = r10.isLoading
            int r0 = r10.editingIndex
            com.facebook.aura.file.view.SlideState r0 = r10.copy(r3, r1, r0)
            r8.Af8(r0)
        L40:
            if (r2 != 0) goto L54
            java.lang.Object r3 = r8.getValue()
            com.facebook.aura.file.view.SlideState r3 = (com.facebook.aura.file.view.SlideState) r3
            r2 = 0
            X.AJp<java.lang.Integer, java.lang.String> r1 = r3.htmlCache
            int r0 = r3.editingIndex
            com.facebook.aura.file.view.SlideState r0 = r3.copy(r1, r2, r0)
            r8.Af8(r0)
        L54:
            r2 = r9
        L55:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r4.next()
            int r9 = r2 + 1
            if (r2 >= 0) goto L6b
            X.AbstractC0885AGm.A14()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L6b:
            com.facebook.aura.file.view.SlideInfo r0 = (com.facebook.aura.file.view.SlideInfo) r0
            java.lang.String r0 = r0.absolutePath
            java.util.List r1 = com.facebook.aura.file.view.HtmlViewerKt.makePathCandidates(r0)
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.L$2 = r7
            r11.L$3 = r8
            r11.L$4 = r4
            r11.L$5 = r0
            r11.L$6 = r0
            r11.I$0 = r9
            r11.I$1 = r2
            r11.label = r5
            java.lang.Object r12 = com.facebook.aura.file.view.HtmlViewerKt.readFirstAvailable(r1, r7, r11)
            if (r12 != r6) goto L1c
            return r6
        L8f:
            X.Hwg.A00(r12)
            java.util.List<com.facebook.aura.file.view.SlideInfo> r4 = r11.$slidesInfo
            if (r4 == 0) goto Lcc
            androidx.compose.runtime.MutableState<com.facebook.aura.file.view.SlideState> r3 = r11.$slideState$delegate
            java.lang.Object r2 = r3.getValue()
            com.facebook.aura.file.view.SlideState r2 = (com.facebook.aura.file.view.SlideState) r2
            X.AJp<java.lang.Integer, java.lang.String> r1 = r2.htmlCache
            int r0 = r2.editingIndex
            com.facebook.aura.file.view.SlideState r0 = r2.copy(r1, r5, r0)
            r3.Af8(r0)
            X.CGz r7 = r11.$userSession
            androidx.compose.runtime.MutableState<com.facebook.aura.file.view.SlideState> r8 = r11.$slideState$delegate
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
            goto L55
        Lb3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lb8:
            androidx.compose.runtime.MutableState<com.facebook.aura.file.view.SlideState> r4 = r11.$slideState$delegate
            java.lang.Object r3 = r4.getValue()
            com.facebook.aura.file.view.SlideState r3 = (com.facebook.aura.file.view.SlideState) r3
            r2 = 0
            X.AJp<java.lang.Integer, java.lang.String> r1 = r3.htmlCache
            int r0 = r3.editingIndex
            com.facebook.aura.file.view.SlideState r0 = r3.copy(r1, r2, r0)
            r4.Af8(r0)
        Lcc:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FileViewerScreenKt$FileViewerScreen$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
