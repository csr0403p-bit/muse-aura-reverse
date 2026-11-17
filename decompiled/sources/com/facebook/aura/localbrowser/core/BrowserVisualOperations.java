package com.facebook.aura.localbrowser.core;

import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.C7384Etj;
import X.G0U;
import X.Hr7;
import com.hatch.browser.protocol.CaptureOptions;
import com.hatch.browser.protocol.Command;
import com.hatch.browser.protocol.DocumentKey;
import com.hatch.browser.protocol.ElementRef;
import com.hatch.browser.protocol.RefScope;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class BrowserVisualOperations {
    public static final int $stable = 0;
    public static final BrowserVisualOperations INSTANCE = new BrowserVisualOperations();
    public static final List<BrowserOperationSpec> specs;

    public static final Command specs$lambda$0(BrowserArgs browserArgs) {
        C7384Etj.A0Y(browserArgs, 0);
        CaptureOptions captureOptions = BrowserVisualOperationsKt.captureOptions(browserArgs);
        if (captureOptions != null) {
            return new Command.Capture(captureOptions, false);
        }
        return null;
    }

    public static final Command specs$lambda$1(BrowserArgs browserArgs) {
        String strString;
        String strString2;
        C7384Etj.A0Y(browserArgs, 0);
        CaptureOptions captureOptions = BrowserVisualOperationsKt.captureOptions(browserArgs);
        if (captureOptions == null || (strString = browserArgs.string(BrowserOperationCatalogKt.REF)) == null || (strString2 = browserArgs.string("scope")) == null) {
            return null;
        }
        ElementRef elementRef = new ElementRef(strString, new RefScope(strString2));
        String strString3 = browserArgs.string("expected_document");
        if (strString3 != null) {
            return new Command.CaptureChallenge(elementRef, new DocumentKey(strString3), captureOptions);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.hatch.browser.protocol.Command specs$lambda$2(com.facebook.aura.localbrowser.core.BrowserArgs r7) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            java.lang.String r0 = "point"
            kotlinx.serialization.json.JsonObject r0 = r7.objectValue(r0)
            r6 = 0
            if (r0 == 0) goto L72
            com.hatch.browser.protocol.Point r4 = com.facebook.aura.localbrowser.core.BrowserVisualOperationsKt.point(r0)
            if (r4 == 0) goto L72
            java.lang.String r0 = "coordinate_scope"
            kotlinx.serialization.json.JsonObject r0 = r7.objectValue(r0)
            if (r0 == 0) goto L72
            com.hatch.browser.protocol.CoordinateScope r3 = com.facebook.aura.localbrowser.core.BrowserVisualOperationsKt.scope(r0)
            if (r3 == 0) goto L72
            java.lang.String r0 = "button"
            java.lang.String r5 = r7.string(r0)
            java.lang.String r2 = "left"
            if (r5 != 0) goto L2c
            r5 = r2
        L2c:
            int r1 = r5.hashCode()
            r0 = -1074341483(0xffffffffbff6d995, float:-1.9285151)
            if (r1 == r0) goto L67
            r0 = 3317767(0x32a007, float:4.649182E-39)
            if (r1 == r0) goto L5e
            r0 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r1 != r0) goto L72
            java.lang.String r0 = "right"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L72
            com.hatch.browser.protocol.MouseButton r2 = com.hatch.browser.protocol.MouseButton.RIGHT
        L49:
            java.lang.String r0 = "double"
            java.lang.Boolean r1 = r7.m1243boolean(r0)
            r0 = 1
            boolean r0 = X.AnonymousClass002.A1b(r1, r0)
            r1 = 1
            if (r0 == 0) goto L58
            r1 = 2
        L58:
            com.hatch.browser.protocol.Command$ClickAt r0 = new com.hatch.browser.protocol.Command$ClickAt
            r0.<init>(r4, r3, r2, r1)
            return r0
        L5e:
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L72
            com.hatch.browser.protocol.MouseButton r2 = com.hatch.browser.protocol.MouseButton.LEFT
            goto L49
        L67:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L72
            com.hatch.browser.protocol.MouseButton r2 = com.hatch.browser.protocol.MouseButton.MIDDLE
            goto L49
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserVisualOperations.specs$lambda$2(com.facebook.aura.localbrowser.core.BrowserArgs):com.hatch.browser.protocol.Command");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.hatch.browser.protocol.Command specs$lambda$3(com.facebook.aura.localbrowser.core.BrowserArgs r11) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r11, r0)
            java.lang.String r0 = "action"
            java.lang.String r2 = r11.string(r0)
            r10 = 0
            if (r2 == 0) goto Ld7
            int r1 = r2.hashCode()
            r0 = 3091764(0x2f2d34, float:4.332484E-39)
            if (r1 == r0) goto L6e
            r0 = 94750088(0x5a5c588, float:1.5589087E-35)
            if (r1 == r0) goto L63
            r0 = 99469628(0x5edc93c, float:2.2361295E-35)
            if (r1 != r0) goto Ld7
            java.lang.String r0 = "hover"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Ld7
            com.hatch.browser.protocol.PointerPathAction r5 = com.hatch.browser.protocol.PointerPathAction.HOVER
        L2a:
            java.lang.String r0 = "points"
            kotlinx.serialization.json.JsonArray r2 = r11.array(r0)
            if (r2 == 0) goto Ld7
            int r1 = r2.size()
            r0 = 1
            if (r0 > r1) goto Ld7
            r0 = 257(0x101, float:3.6E-43)
            if (r1 >= r0) goto Ld7
            java.util.ArrayList r6 = X.AnonymousClass003.A0i(r2)
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r1 = r2.next()
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto Ld7
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            if (r1 == 0) goto Ld7
            com.hatch.browser.protocol.Point r0 = com.facebook.aura.localbrowser.core.BrowserVisualOperationsKt.point(r1)
            if (r0 == 0) goto Ld7
            r6.add(r0)
            goto L45
        L63:
            java.lang.String r0 = "click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Ld7
            com.hatch.browser.protocol.PointerPathAction r5 = com.hatch.browser.protocol.PointerPathAction.CLICK
            goto L2a
        L6e:
            java.lang.String r0 = "drag"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Ld7
            com.hatch.browser.protocol.PointerPathAction r5 = com.hatch.browser.protocol.PointerPathAction.DRAG
            goto L2a
        L79:
            java.lang.String r0 = "coordinate_scope"
            kotlinx.serialization.json.JsonObject r0 = r11.objectValue(r0)
            if (r0 == 0) goto Ld7
            com.hatch.browser.protocol.CoordinateScope r7 = com.facebook.aura.localbrowser.core.BrowserVisualOperationsKt.scope(r0)
            if (r7 == 0) goto Ld7
            java.lang.String r0 = "motion_profile"
            java.lang.String r1 = r11.string(r0)
            java.lang.String r0 = "subtle"
            if (r1 != 0) goto L92
            r1 = r0
        L92:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lcc
            com.hatch.browser.protocol.PointerMotionProfile r8 = com.hatch.browser.protocol.PointerMotionProfile.SUBTLE
        L9a:
            java.lang.String r0 = "click_hold_ms"
            java.lang.Long r0 = r11.m1244long(r0)
            if (r0 == 0) goto Lca
            long r0 = r0.longValue()
            r3 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto Ld7
            r3 = 1001(0x3e9, double:4.946E-321)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Ld7
            int r2 = (int) r0
            X.FKC r9 = X.FKC.A01(r2)
        Lb7:
            java.lang.String r0 = "challenge_proof"
            java.lang.String r0 = r11.string(r0)
            if (r0 == 0) goto Lc4
            com.hatch.browser.protocol.ChallengeProof r10 = new com.hatch.browser.protocol.ChallengeProof
            r10.<init>(r0)
        Lc4:
            com.hatch.browser.protocol.Command$PointerPath r4 = new com.hatch.browser.protocol.Command$PointerPath
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        Lca:
            r9 = r10
            goto Lb7
        Lcc:
            java.lang.String r0 = "natural"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld7
            com.hatch.browser.protocol.PointerMotionProfile r8 = com.hatch.browser.protocol.PointerMotionProfile.NATURAL
            goto L9a
        Ld7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserVisualOperations.specs$lambda$3(com.facebook.aura.localbrowser.core.BrowserArgs):com.hatch.browser.protocol.Command");
    }

    static {
        List<BrowserArg> list = BrowserVisualOperationsKt.captureArgs;
        BrowserOperationSpec browserOperationSpec = new BrowserOperationSpec("browser.capture", "Capture a protected image of the phone browser. Returns encoded image with MIME type, document/viewport scope and region in CSS coordinates. Use that region to map image points.", list, false, new G0U() { // from class: com.facebook.aura.localbrowser.core.BrowserVisualOperations$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return BrowserVisualOperations.specs$lambda$0((BrowserArgs) obj);
            }
        });
        BrowserArgType browserArgType = BrowserArgType.STRING;
        BrowserOperationSpec browserOperationSpec2 = new BrowserOperationSpec("browser.capture_challenge", "Capture a challenge widget by its exact ref and document. Returns protected crop, CSS region, coordinate scope and challenge proof for pointer input.", Hr7.A1G(list, new BrowserArg[]{AbstractC7607F5u.A0w(BrowserOperationCatalogKt.REF, browserArgType, "Challenge element ref from observation.", true), AbstractC7607F5u.A0w("scope", browserArgType, "Scope of the challenge ref.", true), AbstractC7607F5u.A0w("expected_document", browserArgType, "Exact document from observation.", true)}), false, new G0U() { // from class: com.facebook.aura.localbrowser.core.BrowserVisualOperations$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return BrowserVisualOperations.specs$lambda$1((BrowserArgs) obj);
            }
        });
        BrowserArg browserArgA0w = AbstractC7607F5u.A0w("point", BrowserArgType.OBJECT, "CSS point {x: number, y: number}.", true);
        BrowserArg browserArg = BrowserVisualOperationsKt.coordinateScopeArg;
        List listAsList = Arrays.asList(browserArgA0w, browserArg, AbstractC7607F5u.A0w(BrowserOperationCatalogKt.BUTTON, browserArgType, "left (default), middle or right.", false), AbstractC7607F5u.A0w(BrowserOperationCatalogKt.DOUBLE, BrowserArgType.BOOLEAN, "Double-click.", false));
        List<BrowserArg> list2 = BrowserVisualOperationsKt.observationArgs;
        specs = Arrays.asList(browserOperationSpec, browserOperationSpec2, new BrowserOperationSpec("browser.click_at", "Click at CSS coordinates using the exact scope returned by capture. Never use as a fallback for a refused element action; stale document/viewport scopes are rejected.", AbstractC0878AGe.A0P(list2, listAsList), true, new G0U() { // from class: com.facebook.aura.localbrowser.core.BrowserVisualOperations$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return BrowserVisualOperations.specs$lambda$2((BrowserArgs) obj);
            }
        }), new BrowserOperationSpec("browser.pointer_path", "Click, hover or drag along CSS points with a capture's exact coordinate scope. Pass the unchanged challenge proof for challenge input. Do not infer CSS geometry from image pixels.", AbstractC0878AGe.A0P(list2, Arrays.asList(AbstractC7607F5u.A0w("action", browserArgType, "click, hover or drag.", true), AbstractC7607F5u.A0w("points", BrowserArgType.ARRAY, "1\u2013256 CSS points: [{x: number, y: number}, ...].", true), browserArg, AbstractC7607F5u.A0w("motion_profile", browserArgType, "subtle (default) or natural.", false), AbstractC7607F5u.A0w("click_hold_ms", BrowserArgType.INTEGER, "Optional click hold, 0\u20131000 milliseconds.", false), AbstractC7607F5u.A0w("challenge_proof", browserArgType, "Opaque proof returned by capture_challenge.", false))), true, new G0U() { // from class: com.facebook.aura.localbrowser.core.BrowserVisualOperations$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return BrowserVisualOperations.specs$lambda$3((BrowserArgs) obj);
            }
        }));
    }

    public final List<BrowserOperationSpec> getSpecs() {
        return specs;
    }
}
