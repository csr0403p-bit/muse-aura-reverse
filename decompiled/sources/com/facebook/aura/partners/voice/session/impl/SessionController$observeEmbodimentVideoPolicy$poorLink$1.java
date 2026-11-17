package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BN;
import X.C20Z;
import X.C3cG;
import X.C57m;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.os.SystemClock;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rsys.mediastats.gen.MediaStats;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$observeEmbodimentVideoPolicy$poorLink$1", f = "SessionController.kt", l = {4962, 4963}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$observeEmbodimentVideoPolicy$poorLink$1 extends AbstractC07127nr implements G0V<C20Z<? super Boolean>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ EmbodimentLinkQualityGate $gate;
    public final /* synthetic */ C57m $session;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$observeEmbodimentVideoPolicy$poorLink$1(C57m c57m, EmbodimentLinkQualityGate embodimentLinkQualityGate, HtJ<? super SessionController$observeEmbodimentVideoPolicy$poorLink$1> htJ) {
        super(2, htJ);
        this.$session = c57m;
        this.$gate = embodimentLinkQualityGate;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SessionController$observeEmbodimentVideoPolicy$poorLink$1 sessionController$observeEmbodimentVideoPolicy$poorLink$1 = new SessionController$observeEmbodimentVideoPolicy$poorLink$1(this.$session, this.$gate, htJ);
        sessionController$observeEmbodimentVideoPolicy$poorLink$1.L$0 = obj;
        return sessionController$observeEmbodimentVideoPolicy$poorLink$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        final C20Z c20z = (C20Z) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Boolean boolA0h = AnonymousClass001.A0h();
            this.L$0 = c20z;
            this.label = 1;
            if (c20z.emit(boolA0h, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                throw C3cG.A0p();
            }
            Hwg.A00(obj);
        }
        C1BN<List<MediaStats>> c1bn = ((MetaAiRsysSdkRealTimeSession) this.$session).A0C.A0B;
        final EmbodimentLinkQualityGate embodimentLinkQualityGate = this.$gate;
        C20Z<? super List<MediaStats>> c20z2 = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController$observeEmbodimentVideoPolicy$poorLink$1.1
            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                return emit((List<? extends MediaStats>) obj2, (HtJ<? super Unit>) htJ);
            }

            public final Object emit(List<? extends MediaStats> list, HtJ<? super Unit> htJ) {
                Object objEmit;
                Boolean boolOnMediaStats = embodimentLinkQualityGate.onMediaStats(list, SystemClock.elapsedRealtime());
                if (boolOnMediaStats != null && (objEmit = c20z.emit(Boolean.valueOf(boolOnMediaStats.booleanValue()), htJ)) == EnumC10460Hji.A02) {
                    return objEmit;
                }
                return Unit.INSTANCE;
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (c1bn.collect(c20z2, this) == enumC10460Hji) {
            return enumC10460Hji;
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C20Z<? super Boolean> c20z, HtJ<? super Unit> htJ) {
        return ((SessionController$observeEmbodimentVideoPolicy$poorLink$1) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
