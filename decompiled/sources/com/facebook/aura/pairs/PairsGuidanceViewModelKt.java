package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class PairsGuidanceViewModelKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.pairs.PairsGuidanceViewModelKt$io$2", f = "PairsGuidanceViewModel.kt", l = {192}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsGuidanceViewModelKt$io$2, reason: invalid class name */
    public final class AnonymousClass2<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
        public final /* synthetic */ G0U<HtJ<? super T>, Object> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$block = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$block, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
            return new AnonymousClass2(this.$block, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super T>, Object> g0u = this.$block;
                this.label = 1;
                obj = g0u.invoke(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }
    }

    public static final boolean canSaveGuidance(PairsDiscretionDocument pairsDiscretionDocument, String str) {
        boolean zA1a = AnonymousClass002.A1a(pairsDiscretionDocument, str);
        if (pairsDiscretionDocument.ownerText == null || pairsDiscretionDocument.isSaved(str) || !pairsDiscretionDocument.fits(str)) {
            return false;
        }
        return zA1a;
    }

    public static final <T> Object io(G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super T> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(g0u, null));
    }
}
