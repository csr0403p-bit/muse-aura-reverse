package X;

import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import kotlin.Unit;

/* renamed from: X.8ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07288ih extends AbstractC07127nr implements G0V {
    public final int $t = 1;
    public int A00;
    public Object A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl;Ljava/lang/CharSequence;JLX/HtJ<-LX/8ih;>;)V */
    public C07288ih(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, CharSequence charSequence, HtJ htJ, long j) {
        super(2, htJ);
        this.A04 = platformSelectionBehaviorsImpl;
        this.A03 = charSequence;
        this.A02 = j;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C78M c78m;
        long jA05;
        int i = this.$t;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (i != 0) {
            int i2 = this.A00;
            if (i2 == 0) {
                Hwg.A00(obj);
                long j = ((BO7) this.A01).element;
                long j2 = ((BO7) this.A03).element;
                if (j >= j2) {
                    this.A00 = 1;
                    if (GBH.A00(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    c78m = (C78M) this.A04;
                    jA05 = this.A02;
                } else {
                    this.A00 = 2;
                    if (C7Bq.A01((j2 - j) / 1000000, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    c78m = (C78M) this.A04;
                    jA05 = C3cG.A05(c78m.A05.invoke());
                }
            } else if (i2 != 1) {
                Hwg.A00(obj);
                c78m = (C78M) this.A04;
                jA05 = C3cG.A05(c78m.A05.invoke());
            } else {
                Hwg.A00(obj);
                c78m = (C78M) this.A04;
                jA05 = this.A02;
            }
            c78m.A03.A00.A01(new C2286BSm(jA05, 1));
            synchronized (c78m.A04) {
                c78m.A01 = jA05;
            }
        } else {
            int i3 = this.A00;
            if (i3 == 0) {
                Hwg.A00(obj);
                TextClassifier textClassifier = (TextClassifier) this.A01;
                PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.A04;
                CharSequence charSequence = (CharSequence) this.A03;
                long j3 = this.A02;
                this.A00 = 1;
                if (PlatformSelectionBehaviorsImpl.A01(textClassifier, platformSelectionBehaviorsImpl, charSequence, this, j3) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i3 != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t != 0) {
            return new C07288ih((C78M) this.A04, htJ, (BO7) this.A01, (BO7) this.A03, this.A02);
        }
        C07288ih c07288ih = new C07288ih((PlatformSelectionBehaviorsImpl) this.A04, (CharSequence) this.A03, htJ, this.A02);
        c07288ih.A01 = obj;
        return c07288ih;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C07288ih) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BO7;LX/BO7;LX/78M;JLX/HtJ<-LX/8ih;>;)V */
    public C07288ih(C78M c78m, HtJ htJ, BO7 bo7, BO7 bo72, long j) {
        super(2, htJ);
        this.A01 = bo7;
        this.A03 = bo72;
        this.A04 = c78m;
        this.A02 = j;
    }
}
