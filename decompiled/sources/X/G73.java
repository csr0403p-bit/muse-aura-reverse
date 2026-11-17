package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.parser.CancellationToken;

/* loaded from: classes6.dex */
public final class G73 extends G6Z {
    public final /* synthetic */ G7D A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList, java.util.List] */
    @Override // X.G6Z
    public final List<G65> A02(G72 g72, int i, int i2) {
        Object g6b;
        G74 g74;
        G6Z g6z;
        int i3;
        ?? A00;
        C0993AMy c0993AMy;
        Object objA0h;
        C7384Etj.A0Y(g72, 0);
        if (!g72.equals(AbstractC9206G6m.A0O) && !g72.equals(AbstractC9205G6l.A00) && !g72.equals(AbstractC9205G6l.A0Y) && !g72.equals(AbstractC9213G6t.A01)) {
            return super.A02(g72, i, i2);
        }
        G7D g7d = this.A00;
        CharSequence charSequence = super.A00;
        try {
            C9202G6h c9202G6h = g7d.A00;
            C9207G6n c9207G6nCreateInlinesLexer = c9202G6h.createInlinesLexer();
            c9207G6nCreateInlinesLexer.A04 = charSequence;
            c9207G6nCreateInlinesLexer.A01 = i;
            c9207G6nCreateInlinesLexer.A00 = i2;
            InterfaceC9216G6x interfaceC9216G6x = c9207G6nCreateInlinesLexer.A07;
            interfaceC9216G6x.AbL(charSequence, i, i2, 0);
            c9207G6nCreateInlinesLexer.A06 = interfaceC9216G6x.A46();
            c9207G6nCreateInlinesLexer.A03 = interfaceC9216G6x.ALm();
            C9207G6n.A00(c9207G6nCreateInlinesLexer);
            g74 = new G74(c9207G6nCreateInlinesLexer);
            ADq aDqA1C = AbstractC7607F5u.A1C(0, g74.A02.size());
            G7Z sequentialParserManager = c9202G6h.getSequentialParserManager();
            ArrayList arrayListA0h = C3cG.A0h();
            int i4 = aDqA1C.A00;
            int i5 = i4;
            int i6 = aDqA1C.A01;
            int i7 = i6 - 1;
            if (i4 <= i7) {
                while (true) {
                    if (C7384Etj.areEqual(G75.A02(new G75(g74, i5), 0), AbstractC9205G6l.A05)) {
                        if (i4 < i5) {
                            arrayListA0h.add(AbstractC7607F5u.A1C(i4, i5 - 1));
                        }
                        i4 = i5 + 1;
                    }
                    if (i5 == i7) {
                        break;
                    }
                    i5++;
                }
            }
            if (i4 < i6) {
                arrayListA0h.add(AbstractC7607F5u.A1C(i4, i6));
            }
            CancellationToken cancellationToken = g7d.A01;
            Collection<G7A> collectionRunParsingSequence = sequentialParserManager.runParsingSequence(g74, arrayListA0h, cancellationToken);
            g6z = new G6Z(charSequence, cancellationToken);
            i3 = -1;
            A00 = G77.A00(AbstractC0878AGe.A0P(G7A.A00(aDqA1C, g72), collectionRunParsingSequence), cancellationToken);
            c0993AMy = new C0993AMy();
        } catch (MarkdownParsingException e) {
            if (g7d.A02) {
                throw e;
            }
            g6b = new G6B(Collections.singletonList(new G6Q(AbstractC9205G6l.A0a, i, i2)), g72);
        }
        if (A00.isEmpty()) {
            throw new MarkdownParsingException("nonsense");
        }
        if (!((G76) AbstractC0878AGe.A0F(A00)).A01.equals(((G76) AbstractC0878AGe.A0H(A00)).A01)) {
            StringBuilder sbA0x = C60O.A0x("more than one root?\nfirst: ");
            sbA0x.append(((G76) AbstractC0878AGe.A0F(A00)).A01);
            sbA0x.append("\nlast: ");
            throw new MarkdownParsingException(C8j3.A14(((G76) AbstractC0878AGe.A0H(A00)).A01, sbA0x));
        }
        int size = A00.size();
        for (int i8 = 0; i8 < size; i8++) {
            G76 g76 = (G76) A00.get(i8);
            List list = c0993AMy.isEmpty() ? null : (List) ((HxE) AbstractC0878AGe.A0H(c0993AMy)).second;
            C7384Etj.A0Y(g76, 0);
            if (i3 == -1) {
                i3 = g76.A00;
            }
            while (i3 < g76.A00) {
                G75 g75 = new G75(g74, i3);
                if (G75.A02(g75, 0) == null) {
                    throw AbstractC7608F5v.A19();
                }
                G72 g72A02 = G75.A02(g75, 0);
                C7384Etj.A0X(g72A02);
                Iterator<G65> it = g6z.A02(g72A02, G75.A03(g75, 0).A03, G75.A03(g75, 0).A02).iterator();
                while (it.hasNext()) {
                    G65 g65A1D = AbstractC7607F5u.A1D(it);
                    if (list != null) {
                        int i9 = g75.A00;
                        list.add(new G7C(g65A1D, i9, i9 + 1));
                    }
                }
                i3++;
            }
            if (AnonymousClass002.A1P(g76.A01.A00.A01, g76.A00)) {
                c0993AMy.add(C3cG.A0r(g76, C3cG.A0h()));
            } else {
                ADq aDq = g76.A01.A00;
                if (aDq.A00 == aDq.A01) {
                    objA0h = C3cG.A0h();
                } else {
                    HxE hxE = (HxE) c0993AMy.A00();
                    G7A g7a = ((G76) hxE.first).A01;
                    G7A g7a2 = g76.A01;
                    if (!g7a.equals(g7a2)) {
                        StringBuilder sbA0x2 = C60O.A0x("Intersecting parsed nodes detected: ");
                        sbA0x2.append(((G76) hxE.first).A01);
                        throw new MarkdownParsingException(AnonymousClass006.A0y(g7a2, " vs ", sbA0x2));
                    }
                    objA0h = hxE.second;
                }
                List list2 = (List) objA0h;
                boolean zIsEmpty = c0993AMy.isEmpty();
                C7384Etj.A0Y(list2, 1);
                G7A g7a3 = g76.A01;
                G72 g722 = g7a3.A01;
                ADq aDq2 = g7a3.A00;
                int i10 = aDq2.A00;
                int i11 = aDq2.A01;
                ArrayList arrayListA0t = C60Q.A0t(list2);
                if (zIsEmpty) {
                    G75 g752 = new G75(g74, i10);
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 - 1;
                        if (g752.A06(i13) == null || G75.A03(g752, i13).A03 == -1) {
                            break;
                        }
                        i12 = i13;
                    }
                    while (i12 != 0) {
                        A01(arrayListA0t, g6z, g752, i12);
                        i12 -= -1;
                    }
                }
                int size2 = list2.size();
                for (int i14 = 1; i14 < size2; i14++) {
                    G7C g7c = (G7C) list2.get(i14 - 1);
                    G7C g7c2 = (G7C) list2.get(i14);
                    arrayListA0t.add(g7c.A02);
                    int i15 = g7c.A00 - 1;
                    G75 g753 = new G75(g74, g7c2.A01);
                    int i16 = 0;
                    int i17 = G75.A03(g753, 0).A03;
                    G75 g754 = new G75(g74, i15);
                    int i18 = 0;
                    while (true) {
                        i16++;
                        if (g754.A06(i16) == null || G75.A03(g754, i16).A03 == i17) {
                            break;
                        }
                        i18 = i16;
                    }
                    while (i18 != 0) {
                        A01(arrayListA0t, g6z, g754, i18);
                        i18--;
                    }
                }
                if (!list2.isEmpty()) {
                    arrayListA0t.add(((G7C) AbstractC0878AGe.A0H(list2)).A02);
                }
                if (zIsEmpty) {
                    int i19 = 0;
                    int i20 = G75.A03(new G75(g74, i11), 0).A03;
                    G75 g755 = new G75(g74, i11 - 1);
                    int i21 = 0;
                    while (true) {
                        i19++;
                        if (g755.A06(i19) == null || G75.A03(g755, i19).A03 == i20) {
                            break;
                        }
                        i21 = i19;
                    }
                    while (i21 != 0) {
                        A01(arrayListA0t, g6z, g755, i21);
                        i21--;
                    }
                }
                G7C g7c3 = new G7C(G6Z.A00(arrayListA0t, g722), i10, i11);
                if (zIsEmpty) {
                    if (i8 + 1 != A00.size()) {
                        throw AbstractC7608F5v.A19();
                    }
                    g6b = g7c3.A02;
                    return Collections.singletonList(g6b);
                }
                ((List) ((HxE) AbstractC0878AGe.A0H(c0993AMy)).second).add(g7c3);
            }
        }
        throw new AssertionError("markers stack should close some time thus would not be here!");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/CharSequence;I)V */
    public G73(CharSequence charSequence, G7D g7d) {
        super(charSequence, g7d.A01);
        this.A00 = g7d;
    }

    public static void A01(AbstractCollection abstractCollection, G6Z g6z, G75 g75, int i) {
        G72 g72A06 = g75.A06(i);
        C7384Etj.A0X(g72A06);
        abstractCollection.addAll(g6z.A02(g72A06, G75.A03(g75, i).A03, G75.A03(g75, i + 1).A03));
    }
}
