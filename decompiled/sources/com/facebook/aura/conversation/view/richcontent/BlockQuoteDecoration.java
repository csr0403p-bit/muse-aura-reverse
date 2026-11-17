package com.facebook.aura.conversation.view.richcontent;

import X.AT3;
import X.AaC;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.ApQ;
import X.B6A;
import X.C06H;
import X.C16a;
import X.C1733ApU;
import X.C1956Auv;
import X.C1958Aux;
import X.C7384Etj;
import X.C8j3;
import X.C9tI;
import X.F0C;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BlockQuoteDecoration {
    public static final int $stable = 8;
    public static final String ANNOTATION_TAG = "BLOCK_QUOTE";
    public static final Companion Companion = new Companion();
    public final long color;
    public final float gap;
    public final F0C<Boolean> isEnabled;
    public C1958Aux layoutResult;
    public final float width;

    public final void drawAll$fbandroid_express_aura_java_com_facebook_aura_conversation_view_richcontent_richcontent(AT3 at3) {
        C1958Aux c1958Aux;
        C7384Etj.A0Y(at3, 0);
        if (!AnonymousClass001.A1X(this.isEnabled.getValue()) || (c1958Aux = this.layoutResult) == null) {
            return;
        }
        ApQ apQ = c1958Aux.A04.A03;
        Iterator<C1733ApU<String>> it = apQ.A05("BLOCK_QUOTE", 0, apQ.length()).iterator();
        while (it.hasNext()) {
            draw(at3, it.next(), c1958Aux);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.BlockQuoteDecoration$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public BlockQuoteDecoration() {
        float f = 0.0f;
        this(null, 0L, f, f, 15, 0 == true ? 1 : 0);
    }

    private final void draw(AT3 at3, C1733ApU<String> c1733ApU, C1958Aux c1958Aux) {
        int iIntValue;
        C1956Auv c1956Auv = c1958Aux.A03;
        int iA0A = c1956Auv.A0A(c1956Auv.A02 - 1, false);
        int i = c1733ApU.A01;
        if (i < 0) {
            i = 0;
        }
        int iA09 = c1956Auv.A09(i);
        int i2 = c1733ApU.A00 - 1;
        if (i2 <= iA0A) {
            iA0A = i2;
        }
        int iA092 = c1956Auv.A09(iA0A);
        AaC aaCA0f = C8j3.A0f(c1958Aux.A00(iA09), c1956Auv.A07(iA09), c1958Aux.A01(iA092), c1956Auv.A06(iA092));
        Integer numA0r = C9tI.A0r(c1733ApU.A02);
        if (numA0r == null || (iIntValue = numA0r.intValue()) < 1) {
            iIntValue = 1;
        }
        float fAh4 = at3.Ah4(this.width);
        float fAh42 = aaCA0f.A01 + ((iIntValue - 1) * (at3.Ah4(this.gap) + fAh4));
        AaC aaCA0f2 = C8j3.A0f(fAh42, aaCA0f.A03, fAh4 + fAh42, aaCA0f.A00);
        long j = this.color;
        float f = aaCA0f2.A01;
        long jA0J = AnonymousClass005.A0J(f, aaCA0f2.A03);
        long jA01 = aaCA0f2.A01();
        long jA0P = C8j3.A0P(aaCA0f2.A02 - f);
        at3.A9j(null, C16a.A00, 1.0f, 3, j, jA0J, jA01, AnonymousClass002.A0G(jA0P, jA0P << 32));
    }

    public final C1958Aux getLayoutResult() {
        return this.layoutResult;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void setLayoutResult(C1958Aux c1958Aux) {
        this.layoutResult = c1958Aux;
    }

    public BlockQuoteDecoration(F0C<Boolean> f0c, long j, float f, float f2) {
        C7384Etj.A0Y(f0c, 0);
        this.isEnabled = f0c;
        this.color = j;
        this.width = f;
        this.gap = f2;
    }

    public /* synthetic */ BlockQuoteDecoration(F0C f0c, long j, float f, float f2, C06H c06h) {
        this(f0c, j, f, f2);
    }

    public /* synthetic */ BlockQuoteDecoration(F0C f0c, long j, float f, float f2, int i, C06H c06h) {
        this((i & 1) != 0 ? AbstractC5321DgF.A03(AnonymousClass1.INSTANCE) : f0c, (i & 2) != 0 ? B6A.A03 : j, (i & 4) != 0 ? 4.0f : f, (i & 8) != 0 ? 16.0f : f2);
    }
}
