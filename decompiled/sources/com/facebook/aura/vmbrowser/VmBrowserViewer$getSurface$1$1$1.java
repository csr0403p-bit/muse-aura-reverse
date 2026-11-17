package com.facebook.aura.vmbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C3UX;
import X.C3rb;
import X.C60I;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.VmBrowserViewer$getSurface$1$1$1", f = "VmBrowserViewer.kt", l = {73}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VmBrowserViewer$getSurface$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AgentBrowserSurface $viewer;
    public int label;
    public final /* synthetic */ VmBrowserViewer this$0;

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.VmBrowserViewer$getSurface$1$1$1$1", f = "VmBrowserViewer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.VmBrowserViewer$getSurface$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<BrowserTaskPresentation, Boolean, HtJ<? super VmBrowserViewerState>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
        }

        public final Object invoke(BrowserTaskPresentation browserTaskPresentation, boolean z, HtJ<? super VmBrowserViewerState> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = browserTaskPresentation;
            anonymousClass1.Z$0 = z;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) this.L$0;
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return new VmBrowserViewerState(browserTaskPresentation != null ? browserTaskPresentation.browserTaskId : null, z);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(BrowserTaskPresentation browserTaskPresentation, Boolean bool, HtJ<? super VmBrowserViewerState> htJ) {
            return invoke(browserTaskPresentation, AnonymousClass001.A1X(bool), htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmBrowserViewer$getSurface$1$1$1(AgentBrowserSurface agentBrowserSurface, VmBrowserViewer vmBrowserViewer, HtJ<? super VmBrowserViewer$getSurface$1$1$1> htJ) {
        super(2, htJ);
        this.$viewer = agentBrowserSurface;
        this.this$0 = vmBrowserViewer;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VmBrowserViewer$getSurface$1$1$1(this.$viewer, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AgentBrowserSurface agentBrowserSurface = this.$viewer;
            C60I c60iA03 = C3rb.A03(new AnonymousClass1(null), agentBrowserSurface.currentTask, agentBrowserSurface.isPreviewScreenLive);
            final VmBrowserViewer vmBrowserViewer = this.this$0;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.vmbrowser.VmBrowserViewer$getSurface$1$1$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((VmBrowserViewerState) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(VmBrowserViewerState vmBrowserViewerState, HtJ<? super Unit> htJ) {
                    Unit unit;
                    VmBrowserViewer vmBrowserViewer2 = vmBrowserViewer;
                    synchronized (vmBrowserViewer2) {
                        if (vmBrowserViewer2.job.isActive()) {
                            vmBrowserViewer2._state.Af8(vmBrowserViewerState);
                        }
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            };
            this.label = 1;
            if (c60iA03.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VmBrowserViewer$getSurface$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
