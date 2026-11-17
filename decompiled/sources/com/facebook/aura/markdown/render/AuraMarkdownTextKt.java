package com.facebook.aura.markdown.render;

import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C0Yr;
import X.C1736ApY;
import X.C1822Arm;
import X.C1BO;
import X.C78g;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.custom.AuraMarkdown;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraMarkdownTextKt {
    public static final ParsedSource parse(String str) {
        return new ParsedSource(str, AuraMarkdown.INSTANCE.parse(str, true));
    }

    public static final C78g AuraMarkdownText_rAaX7yc$lambda$0$0(C1BO c1bo, C0Yr c0Yr) {
        Function0 function0A0A = C1BO.A0A(c1bo);
        if (function0A0A != null) {
            function0A0A.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.markdown.render.AuraMarkdownTextKt$AuraMarkdownText_rAaX7yc$lambda$0$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    public static final Unit AuraMarkdownText_rAaX7yc$lambda$1(String str, BRg bRg, C1822Arm c1822Arm, boolean z, String str2, String str3, B6A b6a, C1736ApY c1736ApY, B6A b6a2, boolean z2, boolean z3, Function0 function0, int i, int i2, int i3, BFM bfm, int i4) {
        m1368AuraMarkdownTextrAaX7yc(str, bRg, c1822Arm, z, str2, str3, b6a, c1736ApY, b6a2, z2, z3, function0, bfm, AnonymousClass011.A00(i), AnonymousClass011.A01(i2), i3);
        return Unit.INSTANCE;
    }

    public static final Unit AuraMarkdownText_rAaX7yc$lambda$2(String str, BRg bRg, C1822Arm c1822Arm, boolean z, String str2, String str3, B6A b6a, C1736ApY c1736ApY, B6A b6a2, boolean z2, boolean z3, Function0 function0, int i, int i2, int i3, BFM bfm, int i4) {
        m1368AuraMarkdownTextrAaX7yc(str, bRg, c1822Arm, z, str2, str3, b6a, c1736ApY, b6a2, z2, z3, function0, bfm, AnonymousClass011.A00(i), AnonymousClass011.A01(i2), i3);
        return Unit.INSTANCE;
    }

    public static final Unit AuraMarkdownText_rAaX7yc$lambda$4(AuraMarkdownDocument auraMarkdownDocument, BRg bRg, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraMarkdownKt.AuraMarkdown(auraMarkdownDocument, bRg, auraMarkdownTheme, bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuraMarkdownText_rAaX7yc$lambda$5(String str, BRg bRg, C1822Arm c1822Arm, boolean z, String str2, String str3, B6A b6a, C1736ApY c1736ApY, B6A b6a2, boolean z2, boolean z3, Function0 function0, int i, int i2, int i3, BFM bfm, int i4) {
        m1368AuraMarkdownTextrAaX7yc(str, bRg, c1822Arm, z, str2, str3, b6a, c1736ApY, b6a2, z2, z3, function0, bfm, AnonymousClass011.A00(i), AnonymousClass011.A01(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument rememberBackgroundParsedDocument(java.lang.String r5, java.lang.String r6, X.BFM r7, int r8) {
        /*
            androidx.compose.runtime.MutableState r4 = X.C1er.A00(r7, r5)
            r0 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L12
            boolean r0 = r7.A65(r6)
            if (r0 != 0) goto L17
        L12:
            r1 = r8 & 48
            r0 = 0
            if (r1 != r2) goto L18
        L17:
            r0 = 1
        L18:
            java.lang.Object r3 = r7.AaT()
            r2 = 0
            if (r0 != 0) goto L23
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L2b
        L23:
            com.facebook.aura.markdown.render.ParsedSource r0 = parse(r5)
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = X.AbstractC1798ArH.A07(r0, r7)
        L2b:
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            boolean r1 = X.AnonymousClass003.A1K(r7, r4, r3)
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L3b
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L43
        L3b:
            com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1 r0 = new com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1
            r0.<init>(r4, r3, r2)
            X.BBI.A0T(r7, r0)
        L43:
            X.AnonymousClass001.A18(r7, r0, r3)
            java.lang.Object r0 = r3.getValue()
            com.facebook.aura.markdown.render.ParsedSource r0 = (com.facebook.aura.markdown.render.ParsedSource) r0
            com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument r0 = r0.document
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.AuraMarkdownTextKt.rememberBackgroundParsedDocument(java.lang.String, java.lang.String, X.BFM, int):com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument");
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /* renamed from: AuraMarkdownText-rAaX7yc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1368AuraMarkdownTextrAaX7yc(final java.lang.String r34, X.BRg r35, X.C1822Arm r36, boolean r37, java.lang.String r38, java.lang.String r39, X.B6A r40, X.C1736ApY r41, X.B6A r42, boolean r43, boolean r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, X.BFM r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.AuraMarkdownTextKt.m1368AuraMarkdownTextrAaX7yc(java.lang.String, X.BRg, X.Arm, boolean, java.lang.String, java.lang.String, X.B6A, X.ApY, X.B6A, boolean, boolean, kotlin.jvm.functions.Function0, X.BFM, int, int, int):void");
    }
}
