package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7BY;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository$connectionNames$3$1$1$1", f = "PairsRepository.kt", l = {388}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsRepository$connectionNames$3$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends String, ? extends String>>, Object> {
    public final /* synthetic */ String $id;
    public int label;
    public final /* synthetic */ PairsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsRepository$connectionNames$3$1$1$1(PairsRepository pairsRepository, String str, HtJ<? super PairsRepository$connectionNames$3$1$1$1> htJ) {
        super(2, htJ);
        this.this$0 = pairsRepository;
        this.$id = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PairsRepository$connectionNames$3$1$1$1(this.this$0, this.$id, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                PairsRepository pairsRepository = this.this$0;
                String str = this.$id;
                this.label = 1;
                obj = pairsRepository.readConnectionDetail(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            String strPeerDisplayText = PairsTextKt.peerDisplayText(((ConnectionDetailJson) obj).connection.display_name, 256);
            if (strPeerDisplayText != null && !C7BY.A0j(strPeerDisplayText)) {
                return C3cG.A0r(this.$id, strPeerDisplayText);
            }
        } catch (PairsException e) {
            if (e.error == PairsError.UNAVAILABLE) {
                throw e;
            }
        }
        return null;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HxE<String, String>> htJ) {
        return ((PairsRepository$connectionNames$3$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends String, ? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super HxE<String, String>>) htJ);
    }
}
