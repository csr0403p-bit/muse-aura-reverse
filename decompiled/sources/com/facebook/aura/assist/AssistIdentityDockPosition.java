package com.facebook.aura.assist;

import X.ARY;
import X.ASj;
import X.AT5;
import X.ATD;
import X.AVd;
import X.AWx;
import X.AaC;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C2HU;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import androidx.compose.runtime.MutableState;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AssistIdentityDockPosition {
    public static final int $stable = 8;
    public AaC bounds;
    public final MutableState fraction$delegate;
    public HoC snapJob;

    @DebugMetadata(c = "com.facebook.aura.assist.AssistIdentityDockPosition$moveTo$1", f = "AssistIdentityDockPosition.kt", l = {74}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.assist.AssistIdentityDockPosition$moveTo$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $destination;
        public int label;

        /* renamed from: com.facebook.aura.assist.AssistIdentityDockPosition$moveTo$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00371 extends AbstractC7559F3s implements G0U<AT5<AWx, ARY>, Unit> {
            public final /* synthetic */ AssistIdentityDockPosition this$0;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AT5<AWx, ARY> at5) {
                C7384Etj.A0Y(at5, 0);
                this.this$0.m254setFractionk4lQ0M(((AWx) at5.A04.getValue()).A00);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00371(AssistIdentityDockPosition assistIdentityDockPosition) {
                super(1);
                this.this$0 = assistIdentityDockPosition;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AT5<AWx, ARY> at5) {
                invoke2(at5);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$destination = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AssistIdentityDockPosition.this.new AnonymousClass1(this.$destination, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5 at5 = new AT5(AVd.A06, new AWx(AssistIdentityDockPosition.this.m253getFractionF1C5BW0()), null);
                AWx aWx = new AWx(this.$destination);
                ASj aSj = new ASj(C2HU.A01, 180, 0);
                C00371 c00371 = new C00371(AssistIdentityDockPosition.this);
                this.label = 1;
                if (AnonymousClass002.A0i(at5, aSj, aWx, this, c00371) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void moveTo(AssistIdentityEdge assistIdentityEdge, C3UX c3ux) {
        long jA01;
        boolean zA1a = AnonymousClass002.A1a(assistIdentityEdge, c3ux);
        stop();
        int iOrdinal = assistIdentityEdge.ordinal();
        if (iOrdinal == 0) {
            jA01 = AWx.A01(0.0f, 0.0f, 2, m253getFractionF1C5BW0());
        } else if (iOrdinal == zA1a) {
            jA01 = AWx.A01(0.0f, 0.0f, zA1a ? 1 : 0, m253getFractionF1C5BW0());
        } else if (iOrdinal == 2) {
            jA01 = AWx.A01(1.0f, 0.0f, 2, m253getFractionF1C5BW0());
        } else {
            if (iOrdinal != 3) {
                throw C3cG.A0q();
            }
            jA01 = AWx.A01(0.0f, 1.0f, zA1a ? 1 : 0, m253getFractionF1C5BW0());
        }
        this.snapJob = AnonymousClass001.A11(new AnonymousClass1(jA01, null), c3ux);
    }

    /* renamed from: offset-tuRUvjQ, reason: not valid java name */
    public final long m256offsettuRUvjQ(AaC aaC) {
        C7384Etj.A0Y(aaC, 0);
        this.bounds = aaC;
        float f = aaC.A01;
        float f2 = aaC.A02;
        float fA00 = AnonymousClass001.A00(m253getFractionF1C5BW0());
        float f3 = ((1.0f - fA00) * f) + (fA00 * f2);
        AaC aaC2 = this.bounds;
        float f4 = aaC2.A03;
        float f5 = aaC2.A00;
        float fA01 = AnonymousClass001.A01(m253getFractionF1C5BW0(), 4294967295L);
        return AnonymousClass005.A0L(f3, ((1.0f - fA01) * f4) + (fA01 * f5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void snap(C3UX c3ux) {
        C7384Etj.A0Y(c3ux, 0);
        if (this.bounds.A05()) {
            return;
        }
        AssistIdentityEdge assistIdentityEdge = AssistIdentityEdge.LEFT;
        float fA00 = AnonymousClass001.A00(m253getFractionF1C5BW0());
        AaC aaC = this.bounds;
        HxE hxEA0r = C3cG.A0r(assistIdentityEdge, Float.valueOf(fA00 * (aaC.A02 - aaC.A01)));
        AssistIdentityEdge assistIdentityEdge2 = AssistIdentityEdge.TOP;
        float fA01 = AnonymousClass001.A01(m253getFractionF1C5BW0(), 4294967295L);
        AaC aaC2 = this.bounds;
        HxE hxEA0r2 = C3cG.A0r(assistIdentityEdge2, Float.valueOf(fA01 * (aaC2.A00 - aaC2.A03)));
        AssistIdentityEdge assistIdentityEdge3 = AssistIdentityEdge.RIGHT;
        float fA002 = 1.0f - AnonymousClass001.A00(m253getFractionF1C5BW0());
        AaC aaC3 = this.bounds;
        HxE hxEA0r3 = C3cG.A0r(assistIdentityEdge3, Float.valueOf(fA002 * (aaC3.A02 - aaC3.A01)));
        AssistIdentityEdge assistIdentityEdge4 = AssistIdentityEdge.BOTTOM;
        float fA012 = 1.0f - AnonymousClass001.A01(4294967295L, m253getFractionF1C5BW0());
        AaC aaC4 = this.bounds;
        Iterator it = Arrays.asList(hxEA0r, hxEA0r2, hxEA0r3, C3cG.A0r(assistIdentityEdge4, Float.valueOf(fA012 * (aaC4.A00 - aaC4.A03)))).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            float fA02 = AnonymousClass001.A02(((HxE) next).second);
            do {
                Object next2 = it.next();
                float fA022 = AnonymousClass001.A02(((HxE) next2).second);
                if (Float.compare(fA02, fA022) > 0) {
                    next = next2;
                    fA02 = fA022;
                }
            } while (it.hasNext());
        }
        moveTo((AssistIdentityEdge) ((HxE) next).first, c3ux);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssistIdentityEdge.values().length];
            try {
                AnonymousClass002.A13(AssistIdentityEdge.LEFT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AssistIdentityEdge.TOP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AssistIdentityEdge.RIGHT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AssistIdentityEdge.BOTTOM, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFraction-F1C5BW0, reason: not valid java name */
    public final long m253getFractionF1C5BW0() {
        return ((AWx) this.fraction$delegate.getValue()).A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setFraction-k-4lQ0M, reason: not valid java name */
    public final void m254setFractionk4lQ0M(long j) {
        this.fraction$delegate.Af8(new AWx(j));
    }

    public final void stop() {
        this.snapJob = C3cI.A15(this.snapJob);
    }

    public AssistIdentityDockPosition() {
        long jFloatToRawIntBits = Float.floatToRawIntBits(1.0f);
        this.fraction$delegate = AnonymousClass002.A0P(new AWx((jFloatToRawIntBits << 32) | (jFloatToRawIntBits & 4294967295L)));
        this.bounds = AaC.A04;
    }

    /* renamed from: dragBy-k-4lQ0M, reason: not valid java name */
    public final void m255dragByk4lQ0M(long j) {
        float fA00 = AnonymousClass001.A00(m253getFractionF1C5BW0());
        AaC aaC = this.bounds;
        float f = aaC.A02 - aaC.A01;
        float fA03 = ATD.A03(fA00 + (f > 0.0f ? AnonymousClass001.A00(j) / f : 0.0f), 0.0f, 1.0f);
        float fA01 = AnonymousClass001.A01(m253getFractionF1C5BW0(), 4294967295L);
        AaC aaC2 = this.bounds;
        float f2 = aaC2.A00 - aaC2.A03;
        m254setFractionk4lQ0M(AnonymousClass005.A0M(fA03, ATD.A03(fA01 + (f2 > 0.0f ? AnonymousClass001.A01(j, 4294967295L) / f2 : 0.0f), 0.0f, 1.0f)));
    }
}
