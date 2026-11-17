package com.facebook.aura.email.repo;

import X.AbstractC0878AGe;
import X.AbstractC10245Gsg;
import X.AbstractC10254Gss;
import X.AbstractC10315GuV;
import X.AbstractC7559F3s;
import X.AbstractC7609F5w;
import X.AnonymousClass002;
import X.C10242Gsb;
import X.C10257Gsw;
import X.C10262GtH;
import X.C10285Gtp;
import X.C10293Gtx;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C8932Fto;
import X.FGI;
import X.G0U;
import X.Gt2;
import X.Gt3;
import X.Gt4;
import X.Gt5;
import X.Gt8;
import X.GtJ;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class EmailForwardHtmlKt {

    /* renamed from: com.facebook.aura.email.repo.EmailForwardHtmlKt$forwardedEmailHtml$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Gt3, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final CharSequence invoke(Gt3 gt3) {
            C7384Etj.A0Y(gt3, 0);
            String strA09 = gt3.A09();
            C7384Etj.A0U(strA09);
            return strA09;
        }
    }

    public static final String forwardedEmailHtml(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object next;
        Gt3 gt3;
        String strA01;
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(str) || str.length() > 2097152) {
            return null;
        }
        Gt8 gt8A00 = AbstractC10315GuV.A00(str);
        C7384Etj.A0U(gt8A00);
        boolean z = false;
        gt8A00.A01.A02 = false;
        C10242Gsb c10242GsbA00 = AbstractC10254Gss.A00("*", gt8A00.A0h());
        C7384Etj.A0U(c10242GsbA00);
        Iterator<T> it = c10242GsbA00.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<C10262GtH> listA00 = Gt3.A00(C10262GtH.class, (Gt3) next);
            C7384Etj.A0U(listA00);
            if (!(listA00 instanceof Collection) || !listA00.isEmpty()) {
                for (C10262GtH c10262GtH : listA00) {
                    if (c10262GtH instanceof C10285Gtp) {
                        strA01 = c10262GtH.A0T();
                    } else {
                        String strA0T = c10262GtH.A0T();
                        StringBuilder sbA0t = AbstractC7609F5w.A0t();
                        Gt5.A03(strA0T, sbA0t, false);
                        strA01 = Gt5.A01(sbA0t);
                    }
                    C7384Etj.A0U(strA01);
                    String strA0l = AnonymousClass002.A0l(strA01);
                    C7384Etj.A0Y(strA0l, 0);
                    if (strA0l.startsWith("---------- Forwarded message") || strA0l.startsWith("Begin forwarded message:")) {
                        break loop0;
                    }
                }
            }
        }
        Gt4 gt4 = (Gt4) next;
        if (gt4 == null) {
            return null;
        }
        C10242Gsb c10242GsbA002 = AbstractC10254Gss.A00("style", gt8A00);
        C7384Etj.A0U(c10242GsbA002);
        String strA0L = AbstractC0878AGe.A0L("", "", "", c10242GsbA002, EmailForwardHtmlKt$forwardedEmailHtml$styles$1.INSTANCE);
        C10293Gtx.A01("divRplyFwdMsg");
        C10257Gsw c10257Gsw = new C10257Gsw("divRplyFwdMsg");
        c10257Gsw.A01();
        Gt4 gt42 = (Gt4) Gt2.A00(Gt3.class, gt8A00).filter(new C8932Fto(gt8A00, c10257Gsw, 1)).findFirst().orElse(null);
        c10257Gsw.A01();
        Gt3 gt32 = gt4.A01;
        if (gt32 != null) {
            C10293Gtx.A01("blockquote[type=cite]");
            AbstractC10245Gsg abstractC10245GsgA08 = GtJ.A08("blockquote[type=cite]");
            abstractC10245GsgA08.A01();
            Gt3 gt33 = (Gt3) Gt2.A00(Gt3.class, gt32).filter(new C8932Fto(gt32, abstractC10245GsgA08, 1)).findFirst().orElse(null);
            abstractC10245GsgA08.A01();
            if (gt33 != null) {
                String strA0W = gt33.A0W();
                C7384Etj.A0U(strA0W);
                if (!C7BY.A0q(strA0W, "Begin forwarded message:", false)) {
                    return FGI.A0M(strA0L, gt33.A0U());
                }
            }
        }
        if (gt42 != null) {
            gt4 = gt42;
        }
        while (true) {
            Gt3 gt34 = gt4.A01;
            if (gt34 == null || gt34.equals(gt8A00.A0h()) || (gt3 = gt4.A01) == null || gt3.A0g("gmail_quote") || "blockquote".equals(gt3.A02.A04) || gt4.A0E() != null) {
                break;
            }
            gt4 = gt3;
        }
        if (gt4.equals(gt8A00.A0h())) {
            return null;
        }
        C10242Gsb c10242Gsb = new C10242Gsb();
        if (gt4.A01 != null) {
            c10242Gsb.add(gt4);
            C10242Gsb c10242Gsb2 = new C10242Gsb();
            Iterator<T> it2 = c10242Gsb.iterator();
            while (it2.hasNext()) {
                Gt4 gt4A0E = (Gt4) it2.next();
                while (true) {
                    gt4A0E = gt4A0E.A0E();
                    if (gt4A0E != null) {
                        c10242Gsb2.add(gt4A0E);
                    }
                }
            }
            c10242Gsb = c10242Gsb2;
        }
        if (c10242Gsb.isEmpty()) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<T> it3 = c10242Gsb.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (z) {
                arrayListA0h.add(next2);
            } else if (!"br".equals(((Gt3) next2).A02.A04)) {
                arrayListA0h.add(next2);
                z = true;
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return FGI.A0M(strA0L, AbstractC0878AGe.A0L("", "", "", arrayListA0h, AnonymousClass1.INSTANCE));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isPlainTextEmailHtml(java.lang.String r11, java.lang.String r12) {
        /*
            r5 = 0
            if (r12 == 0) goto L68
            boolean r0 = X.C7BY.A0j(r12)
            if (r0 != 0) goto L68
            X.Gt8 r3 = X.AbstractC10315GuV.A00(r11)
            X.C7384Etj.A0U(r3)
            X.Gsu r0 = new X.Gsu
            r0.<init>()
            X.Gsb r1 = X.AbstractC10244Gsf.A00(r3, r0)
            X.C7384Etj.A0U(r1)
            boolean r0 = r1 instanceof java.util.Collection
            java.lang.String r10 = "p"
            if (r0 == 0) goto L69
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L69
        L28:
            X.Gt3 r1 = r3.A0h()
            java.util.List r0 = X.Gt3.A01(r1)
            X.Gsb r3 = new X.Gsb
            r3.<init>(r0)
            java.lang.String r0 = r1.A0V()
            X.C7384Etj.A0U(r0)
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 == 0) goto L68
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L68
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto La0
            java.util.Iterator r1 = r3.iterator()
        L52:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r1.next()
            X.Gt3 r0 = (X.Gt3) r0
            X.Guc r0 = r0.A02
            java.lang.String r0 = r0.A04
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L52
        L68:
            return r5
        L69:
            java.util.Iterator r4 = r1.iterator()
        L6d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r2 = r4.next()
            X.Gt3 r2 = (X.Gt3) r2
            java.lang.String r6 = "#root"
            java.lang.String r7 = "html"
            java.lang.String r8 = "head"
            java.lang.String r9 = "body"
            java.lang.String r11 = "br"
            java.lang.String[] r0 = new java.lang.String[]{r6, r7, r8, r9, r10, r11}
            java.util.Set r1 = X.BFI.A0H(r0)
            X.Guc r0 = r2.A02
            java.lang.String r0 = r0.A04
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L68
            X.Gt7 r0 = r2.A0D()
            int r0 = r0.A05()
            if (r0 == 0) goto L6d
            return r5
        La0:
            java.lang.String r2 = "\n\n"
            com.facebook.aura.email.repo.EmailForwardHtmlKt$isPlainTextEmailHtml$unwrapped$1 r1 = com.facebook.aura.email.repo.EmailForwardHtmlKt$isPlainTextEmailHtml$unwrapped$1.INSTANCE
            java.lang.String r0 = ""
            java.lang.String r0 = X.AbstractC0878AGe.A0L(r2, r0, r0, r3, r1)
            java.lang.String r2 = X.AnonymousClass002.A0l(r0)
            java.lang.String r1 = "\r\n"
            java.lang.String r0 = "\n"
            java.lang.String r0 = X.AbstractC2159Azp.A0z(r12, r1, r0)
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            boolean r5 = X.C7384Etj.areEqual(r2, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailForwardHtmlKt.isPlainTextEmailHtml(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.email.repo.EmailRichContent richContent(com.facebook.aura.email.repo.EmailMessageJson r7) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            java.lang.String r5 = r7.html_body
            r4 = 0
            if (r5 == 0) goto L9a
            boolean r0 = X.C7BY.A0j(r5)
            r6 = 2097152(0x200000, float:2.938736E-39)
            if (r0 != 0) goto L9a
            int r0 = r5.length()
            if (r0 > r6) goto L9a
            java.lang.String r0 = r7.text_body
            boolean r0 = isPlainTextEmailHtml(r5, r0)
            if (r0 != 0) goto L9a
            java.util.List<com.facebook.aura.email.repo.EmailForwardedJson> r3 = r7.forwarded_messages
            if (r3 != 0) goto L25
            X.AGi r3 = X.C0881AGi.A00
        L25:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L80
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L80
        L2f:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L53
            java.lang.String r0 = r7.in_reply_to
            if (r0 == 0) goto L3f
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 == 0) goto L9a
        L3f:
            java.util.List<java.lang.String> r0 = r7.references
            if (r0 == 0) goto L49
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9a
        L49:
            java.lang.String r0 = com.facebook.aura.email.repo.EmailEmbeddedImagesKt.restoreEmbeddedEmailImages(r5)
            com.facebook.aura.email.repo.EmailRichContent r3 = new com.facebook.aura.email.repo.EmailRichContent
            r3.<init>(r0, r4, r4)
            return r3
        L53:
            java.lang.Object r3 = X.AbstractC0878AGe.A0K(r3)
            com.facebook.aura.email.repo.EmailForwardedJson r3 = (com.facebook.aura.email.repo.EmailForwardedJson) r3
            if (r3 == 0) goto L9a
            java.lang.String r1 = r3.html_body
            if (r1 == 0) goto L79
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L79
            int r0 = r1.length()
            if (r0 > r6) goto L79
        L6b:
            java.lang.String r2 = com.facebook.aura.email.repo.EmailEmbeddedImagesKt.restoreEmbeddedEmailImages(r1)
            java.lang.String r1 = r7.extracted_text
            java.lang.String r0 = r3.text_body
            com.facebook.aura.email.repo.EmailRichContent r3 = new com.facebook.aura.email.repo.EmailRichContent
            r3.<init>(r2, r1, r0)
            return r3
        L79:
            java.lang.String r1 = forwardedEmailHtml(r5)
            if (r1 != 0) goto L6b
            return r4
        L80:
            java.util.Iterator r2 = r3.iterator()
        L84:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            com.facebook.aura.email.repo.EmailForwardedJson r0 = (com.facebook.aura.email.repo.EmailForwardedJson) r0
            java.lang.String r1 = r0.format
            java.lang.String r0 = "INLINE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L84
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailForwardHtmlKt.richContent(com.facebook.aura.email.repo.EmailMessageJson):com.facebook.aura.email.repo.EmailRichContent");
    }
}
