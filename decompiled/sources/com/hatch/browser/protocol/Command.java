package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C8j5;
import X.FGI;
import X.FKC;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Command {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Capture extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final boolean fullPage;
        public final CaptureOptions options;

        public Capture(CaptureOptions captureOptions, boolean z) {
            C7384Etj.A0Y(captureOptions, 0);
            this.options = captureOptions;
            this.fullPage = z;
        }

        public final Capture copy(CaptureOptions captureOptions, boolean z) {
            C7384Etj.A0Y(captureOptions, 0);
            return new Capture(captureOptions, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Capture) {
                    Capture capture = (Capture) obj;
                    if (!C7384Etj.areEqual(this.options, capture.options) || this.fullPage != capture.fullPage) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Capture copy$default(Capture capture, CaptureOptions captureOptions, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                captureOptions = capture.options;
            }
            if ((i & 2) != 0) {
                z = capture.fullPage;
            }
            C7384Etj.A0Y(captureOptions, 0);
            return new Capture(captureOptions, z);
        }

        public final CaptureOptions component1() {
            return this.options;
        }

        public final boolean component2() {
            return this.fullPage;
        }

        public final boolean getFullPage() {
            return this.fullPage;
        }

        public final CaptureOptions getOptions() {
            return this.options;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.options), this.fullPage);
        }

        public String toString() {
            CaptureOptions captureOptions = this.options;
            return C8j5.A0W(", fullPage=", C3cG.A0f(captureOptions, "Capture(options="), this.fullPage);
        }
    }

    public final class CaptureChallenge extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;
        public final DocumentKey expectedDocument;
        public final CaptureOptions options;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CaptureChallenge) {
                    CaptureChallenge captureChallenge = (CaptureChallenge) obj;
                    if (!C7384Etj.areEqual(this.element, captureChallenge.element) || !C7384Etj.areEqual(this.expectedDocument, captureChallenge.expectedDocument) || !C7384Etj.areEqual(this.options, captureChallenge.options)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ CaptureChallenge copy$default(CaptureChallenge captureChallenge, ElementRef elementRef, DocumentKey documentKey, CaptureOptions captureOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = captureChallenge.element;
            }
            if ((i & 2) != 0) {
                documentKey = captureChallenge.expectedDocument;
            }
            if ((i & 4) != 0) {
                captureOptions = captureChallenge.options;
            }
            return captureChallenge.copy(elementRef, documentKey, captureOptions);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final DocumentKey component2() {
            return this.expectedDocument;
        }

        public final CaptureOptions component3() {
            return this.options;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public final DocumentKey getExpectedDocument() {
            return this.expectedDocument;
        }

        public final CaptureOptions getOptions() {
            return this.options;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.options, AnonymousClass005.A0F(this.expectedDocument, AnonymousClass005.A0E(this.element)));
        }

        public String toString() {
            ElementRef elementRef = this.element;
            DocumentKey documentKey = this.expectedDocument;
            CaptureOptions captureOptions = this.options;
            StringBuilder sbA0f = C3cG.A0f(elementRef, "CaptureChallenge(element=");
            sbA0f.append(", expectedDocument=");
            sbA0f.append(documentKey);
            return C3cJ.A0L(captureOptions, ", options=", sbA0f);
        }

        public CaptureChallenge(ElementRef elementRef, DocumentKey documentKey, CaptureOptions captureOptions) {
            AnonymousClass005.A0x(elementRef, documentKey, captureOptions);
            this.element = elementRef;
            this.expectedDocument = documentKey;
            this.options = captureOptions;
        }

        public final CaptureChallenge copy(ElementRef elementRef, DocumentKey documentKey, CaptureOptions captureOptions) {
            AnonymousClass005.A0x(elementRef, documentKey, captureOptions);
            return new CaptureChallenge(elementRef, documentKey, captureOptions);
        }
    }

    public final class Click extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final MouseButton button;
        public final byte clickCount;
        public final ElementRef element;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Click) {
                    Click click = (Click) obj;
                    if (!C7384Etj.areEqual(this.element, click.element) || this.button != click.button || this.clickCount != click.clickCount) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* renamed from: copy-sEu17AQ$default, reason: not valid java name */
        public static /* synthetic */ Click m3299copysEu17AQ$default(Click click, ElementRef elementRef, MouseButton mouseButton, byte b, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = click.element;
            }
            if ((i & 2) != 0) {
                mouseButton = click.button;
            }
            if ((i & 4) != 0) {
                b = click.clickCount;
            }
            return click.m3301copysEu17AQ(elementRef, mouseButton, b);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final MouseButton component2() {
            return this.button;
        }

        /* renamed from: component3-w2LRezQ, reason: not valid java name */
        public final byte m3300component3w2LRezQ() {
            return this.clickCount;
        }

        public final MouseButton getButton() {
            return this.button;
        }

        /* renamed from: getClickCount-w2LRezQ, reason: not valid java name */
        public final byte m3302getClickCountw2LRezQ() {
            return this.clickCount;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.button, AnonymousClass005.A0E(this.element)) + this.clickCount;
        }

        public String toString() {
            ElementRef elementRef = this.element;
            MouseButton mouseButton = this.button;
            String strValueOf = String.valueOf(this.clickCount & 255);
            StringBuilder sbA0f = C3cG.A0f(elementRef, "Click(element=");
            sbA0f.append(", button=");
            sbA0f.append(mouseButton);
            return C3cJ.A0N(", clickCount=", strValueOf, sbA0f);
        }

        /* renamed from: copy-sEu17AQ, reason: not valid java name */
        public final Click m3301copysEu17AQ(ElementRef elementRef, MouseButton mouseButton, byte b) {
            AnonymousClass003.A0u(elementRef, mouseButton);
            return new Click(elementRef, mouseButton, b);
        }

        public /* synthetic */ Click(ElementRef elementRef, MouseButton mouseButton, byte b, C06H c06h) {
            this(elementRef, mouseButton, b);
        }

        public Click(ElementRef elementRef, MouseButton mouseButton, byte b) {
            AnonymousClass003.A0u(elementRef, mouseButton);
            this.element = elementRef;
            this.button = mouseButton;
            this.clickCount = b;
        }
    }

    public final class ClickAt extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final MouseButton button;
        public final byte clickCount;
        public final Point point;
        public final CoordinateScope scope;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ClickAt) {
                    ClickAt clickAt = (ClickAt) obj;
                    if (!C7384Etj.areEqual(this.point, clickAt.point) || !C7384Etj.areEqual(this.scope, clickAt.scope) || this.button != clickAt.button || this.clickCount != clickAt.clickCount) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* renamed from: copy-jDvRwcg$default, reason: not valid java name */
        public static /* synthetic */ ClickAt m3303copyjDvRwcg$default(ClickAt clickAt, Point point, CoordinateScope coordinateScope, MouseButton mouseButton, byte b, int i, Object obj) {
            if ((i & 1) != 0) {
                point = clickAt.point;
            }
            if ((i & 2) != 0) {
                coordinateScope = clickAt.scope;
            }
            if ((i & 4) != 0) {
                mouseButton = clickAt.button;
            }
            if ((i & 8) != 0) {
                b = clickAt.clickCount;
            }
            AnonymousClass005.A0x(point, coordinateScope, mouseButton);
            return new ClickAt(point, coordinateScope, mouseButton, b);
        }

        public final Point component1() {
            return this.point;
        }

        public final CoordinateScope component2() {
            return this.scope;
        }

        public final MouseButton component3() {
            return this.button;
        }

        /* renamed from: component4-w2LRezQ, reason: not valid java name */
        public final byte m3304component4w2LRezQ() {
            return this.clickCount;
        }

        public final MouseButton getButton() {
            return this.button;
        }

        /* renamed from: getClickCount-w2LRezQ, reason: not valid java name */
        public final byte m3306getClickCountw2LRezQ() {
            return this.clickCount;
        }

        public final Point getPoint() {
            return this.point;
        }

        public final CoordinateScope getScope() {
            return this.scope;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.button, AnonymousClass005.A0F(this.scope, AnonymousClass005.A0E(this.point))) + this.clickCount;
        }

        public String toString() {
            Point point = this.point;
            CoordinateScope coordinateScope = this.scope;
            MouseButton mouseButton = this.button;
            String strValueOf = String.valueOf(this.clickCount & 255);
            StringBuilder sbA0f = C3cG.A0f(point, "ClickAt(point=");
            AbstractC7609F5w.A1M(sbA0f, coordinateScope);
            sbA0f.append(", button=");
            sbA0f.append(mouseButton);
            return C3cJ.A0N(", clickCount=", strValueOf, sbA0f);
        }

        public ClickAt(Point point, CoordinateScope coordinateScope, MouseButton mouseButton, byte b) {
            AnonymousClass005.A0x(point, coordinateScope, mouseButton);
            this.point = point;
            this.scope = coordinateScope;
            this.button = mouseButton;
            this.clickCount = b;
        }

        /* renamed from: copy-jDvRwcg, reason: not valid java name */
        public final ClickAt m3305copyjDvRwcg(Point point, CoordinateScope coordinateScope, MouseButton mouseButton, byte b) {
            AnonymousClass005.A0x(point, coordinateScope, mouseButton);
            return new ClickAt(point, coordinateScope, mouseButton, b);
        }

        public /* synthetic */ ClickAt(Point point, CoordinateScope coordinateScope, MouseButton mouseButton, byte b, C06H c06h) {
            this(point, coordinateScope, mouseButton, b);
        }
    }

    public final class CredentialClear extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final CredentialFieldKind fieldKind;
        public final CredentialProof proof;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CredentialClear) {
                    CredentialClear credentialClear = (CredentialClear) obj;
                    if (!C7384Etj.areEqual(this.proof, credentialClear.proof) || this.fieldKind != credentialClear.fieldKind) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ CredentialClear copy$default(CredentialClear credentialClear, CredentialProof credentialProof, CredentialFieldKind credentialFieldKind, int i, Object obj) {
            if ((i & 1) != 0) {
                credentialProof = credentialClear.proof;
            }
            if ((i & 2) != 0) {
                credentialFieldKind = credentialClear.fieldKind;
            }
            AnonymousClass003.A0u(credentialProof, credentialFieldKind);
            return new CredentialClear(credentialProof, credentialFieldKind);
        }

        public final CredentialProof component1() {
            return this.proof;
        }

        public final CredentialFieldKind component2() {
            return this.fieldKind;
        }

        public final CredentialFieldKind getFieldKind() {
            return this.fieldKind;
        }

        public final CredentialProof getProof() {
            return this.proof;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.fieldKind, AnonymousClass005.A0E(this.proof));
        }

        public String toString() {
            return C3cJ.A0L(this.fieldKind, ", fieldKind=", C3cG.A0f(this.proof, "CredentialClear(proof="));
        }

        public CredentialClear(CredentialProof credentialProof, CredentialFieldKind credentialFieldKind) {
            AnonymousClass003.A0u(credentialProof, credentialFieldKind);
            this.proof = credentialProof;
            this.fieldKind = credentialFieldKind;
        }

        public final CredentialClear copy(CredentialProof credentialProof, CredentialFieldKind credentialFieldKind) {
            AnonymousClass003.A0u(credentialProof, credentialFieldKind);
            return new CredentialClear(credentialProof, credentialFieldKind);
        }
    }

    public final class CredentialFill extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final CredentialFieldKind fieldKind;
        public final CredentialProof proof;
        public final String sealedValue;
        public final String value;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CredentialFill) {
                    CredentialFill credentialFill = (CredentialFill) obj;
                    if (!C7384Etj.areEqual(this.proof, credentialFill.proof) || this.fieldKind != credentialFill.fieldKind || !C7384Etj.areEqual(this.value, credentialFill.value) || !C7384Etj.areEqual(this.sealedValue, credentialFill.sealedValue)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ CredentialFill copy$default(CredentialFill credentialFill, CredentialProof credentialProof, CredentialFieldKind credentialFieldKind, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                credentialProof = credentialFill.proof;
            }
            if ((i & 2) != 0) {
                credentialFieldKind = credentialFill.fieldKind;
            }
            if ((i & 4) != 0) {
                str = credentialFill.value;
            }
            if ((i & 8) != 0) {
                str2 = credentialFill.sealedValue;
            }
            AnonymousClass005.A0x(credentialProof, credentialFieldKind, str);
            return new CredentialFill(credentialProof, credentialFieldKind, str, str2);
        }

        public final CredentialProof component1() {
            return this.proof;
        }

        public final CredentialFieldKind component2() {
            return this.fieldKind;
        }

        public final String component3() {
            return this.value;
        }

        public final String component4() {
            return this.sealedValue;
        }

        public final CredentialFieldKind getFieldKind() {
            return this.fieldKind;
        }

        public final CredentialProof getProof() {
            return this.proof;
        }

        public final String getSealedValue() {
            return this.sealedValue;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.value, AnonymousClass005.A0F(this.fieldKind, AnonymousClass005.A0E(this.proof))) + AnonymousClass006.A0G(this.sealedValue);
        }

        public String toString() {
            CredentialProof credentialProof = this.proof;
            CredentialFieldKind credentialFieldKind = this.fieldKind;
            String str = this.value;
            String str2 = this.sealedValue;
            StringBuilder sbA0f = C3cG.A0f(credentialProof, "CredentialFill(proof=");
            sbA0f.append(", fieldKind=");
            sbA0f.append(credentialFieldKind);
            sbA0f.append(", value=");
            sbA0f.append(str);
            return C3cJ.A0N(", sealedValue=", str2, sbA0f);
        }

        public CredentialFill(CredentialProof credentialProof, CredentialFieldKind credentialFieldKind, String str, String str2) {
            AnonymousClass005.A0x(credentialProof, credentialFieldKind, str);
            this.proof = credentialProof;
            this.fieldKind = credentialFieldKind;
            this.value = str;
            this.sealedValue = str2;
        }

        public final CredentialFill copy(CredentialProof credentialProof, CredentialFieldKind credentialFieldKind, String str, String str2) {
            AnonymousClass005.A0x(credentialProof, credentialFieldKind, str);
            return new CredentialFill(credentialProof, credentialFieldKind, str, str2);
        }
    }

    public final class CredentialRefsPreflight extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final List<ElementRef> elements;
        public final CredentialFieldKind fieldKind;
        public final ExpectedOrigins origins;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CredentialRefsPreflight) {
                    CredentialRefsPreflight credentialRefsPreflight = (CredentialRefsPreflight) obj;
                    if (!C7384Etj.areEqual(this.elements, credentialRefsPreflight.elements) || this.fieldKind != credentialRefsPreflight.fieldKind || !C7384Etj.areEqual(this.origins, credentialRefsPreflight.origins)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CredentialRefsPreflight copy$default(CredentialRefsPreflight credentialRefsPreflight, List list, CredentialFieldKind credentialFieldKind, ExpectedOrigins expectedOrigins, int i, Object obj) {
            if ((i & 1) != 0) {
                list = credentialRefsPreflight.elements;
            }
            if ((i & 2) != 0) {
                credentialFieldKind = credentialRefsPreflight.fieldKind;
            }
            if ((i & 4) != 0) {
                expectedOrigins = credentialRefsPreflight.origins;
            }
            return credentialRefsPreflight.copy(list, credentialFieldKind, expectedOrigins);
        }

        public final List<ElementRef> component1() {
            return this.elements;
        }

        public final CredentialFieldKind component2() {
            return this.fieldKind;
        }

        public final ExpectedOrigins component3() {
            return this.origins;
        }

        public final List<ElementRef> getElements() {
            return this.elements;
        }

        public final CredentialFieldKind getFieldKind() {
            return this.fieldKind;
        }

        public final ExpectedOrigins getOrigins() {
            return this.origins;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.origins, AnonymousClass005.A0F(this.fieldKind, AnonymousClass005.A0E(this.elements)));
        }

        public String toString() {
            List<ElementRef> list = this.elements;
            CredentialFieldKind credentialFieldKind = this.fieldKind;
            ExpectedOrigins expectedOrigins = this.origins;
            StringBuilder sbA0f = C3cG.A0f(list, "CredentialRefsPreflight(elements=");
            sbA0f.append(", fieldKind=");
            sbA0f.append(credentialFieldKind);
            return C3cJ.A0L(expectedOrigins, ", origins=", sbA0f);
        }

        public CredentialRefsPreflight(List<ElementRef> list, CredentialFieldKind credentialFieldKind, ExpectedOrigins expectedOrigins) {
            AnonymousClass005.A0x(list, credentialFieldKind, expectedOrigins);
            this.elements = list;
            this.fieldKind = credentialFieldKind;
            this.origins = expectedOrigins;
        }

        public final CredentialRefsPreflight copy(List<ElementRef> list, CredentialFieldKind credentialFieldKind, ExpectedOrigins expectedOrigins) {
            AnonymousClass005.A0x(list, credentialFieldKind, expectedOrigins);
            return new CredentialRefsPreflight(list, credentialFieldKind, expectedOrigins);
        }
    }

    public final class Download extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final String destination;
        public final ElementRef target;

        public Download(ElementRef elementRef, String str) {
            C7384Etj.A0Y(str, 1);
            this.target = elementRef;
            this.destination = str;
        }

        public final Download copy(ElementRef elementRef, String str) {
            C7384Etj.A0Y(str, 1);
            return new Download(elementRef, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Download) {
                    Download download = (Download) obj;
                    if (!C7384Etj.areEqual(this.target, download.target) || !C7384Etj.areEqual(this.destination, download.destination)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Download copy$default(Download download, ElementRef elementRef, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = download.target;
            }
            if ((i & 2) != 0) {
                str = download.destination;
            }
            C7384Etj.A0Y(str, 1);
            return new Download(elementRef, str);
        }

        public final ElementRef component1() {
            return this.target;
        }

        public final String component2() {
            return this.destination;
        }

        public final String getDestination() {
            return this.destination;
        }

        public final ElementRef getTarget() {
            return this.target;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.destination, AnonymousClass006.A0D(this.target) * 31);
        }

        public String toString() {
            return C3cJ.A0N(", destination=", this.destination, C3cG.A0f(this.target, "Download(target="));
        }
    }

    public final class Fill extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;
        public final TextEntry entry;
        public final TextMode mode;
        public final SubmitIntent submit;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Fill) {
                    Fill fill = (Fill) obj;
                    if (!C7384Etj.areEqual(this.element, fill.element) || !C7384Etj.areEqual(this.text, fill.text) || this.mode != fill.mode || !C7384Etj.areEqual(this.submit, fill.submit) || this.entry != fill.entry) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Fill copy$default(Fill fill, ElementRef elementRef, String str, TextMode textMode, SubmitIntent submitIntent, TextEntry textEntry, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = fill.element;
            }
            if ((i & 2) != 0) {
                str = fill.text;
            }
            if ((i & 4) != 0) {
                textMode = fill.mode;
            }
            if ((i & 8) != 0) {
                submitIntent = fill.submit;
            }
            if ((i & 16) != 0) {
                textEntry = fill.entry;
            }
            return fill.copy(elementRef, str, textMode, submitIntent, textEntry);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final String component2() {
            return this.text;
        }

        public final TextMode component3() {
            return this.mode;
        }

        public final SubmitIntent component4() {
            return this.submit;
        }

        public final TextEntry component5() {
            return this.entry;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public final TextEntry getEntry() {
            return this.entry;
        }

        public final TextMode getMode() {
            return this.mode;
        }

        public final SubmitIntent getSubmit() {
            return this.submit;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.mode, AnonymousClass005.A0I(this.text, AnonymousClass005.A0E(this.element))) + AnonymousClass006.A0D(this.submit)) * 31) + C3cH.A02(this.entry);
        }

        public String toString() {
            ElementRef elementRef = this.element;
            String str = this.text;
            TextMode textMode = this.mode;
            SubmitIntent submitIntent = this.submit;
            TextEntry textEntry = this.entry;
            StringBuilder sbA0f = C3cG.A0f(elementRef, "Fill(element=");
            sbA0f.append(", text=");
            sbA0f.append(str);
            sbA0f.append(", mode=");
            sbA0f.append(textMode);
            sbA0f.append(", submit=");
            sbA0f.append(submitIntent);
            return C3cJ.A0L(textEntry, ", entry=", sbA0f);
        }

        public Fill(ElementRef elementRef, String str, TextMode textMode, SubmitIntent submitIntent, TextEntry textEntry) {
            AnonymousClass005.A0x(elementRef, str, textMode);
            this.element = elementRef;
            this.text = str;
            this.mode = textMode;
            this.submit = submitIntent;
            this.entry = textEntry;
        }

        public final Fill copy(ElementRef elementRef, String str, TextMode textMode, SubmitIntent submitIntent, TextEntry textEntry) {
            AnonymousClass005.A0x(elementRef, str, textMode);
            return new Fill(elementRef, str, textMode, submitIntent, textEntry);
        }
    }

    public final class FillAt extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final TextMode mode;
        public final Point point;
        public final CoordinateScope scope;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FillAt) {
                    FillAt fillAt = (FillAt) obj;
                    if (!C7384Etj.areEqual(this.point, fillAt.point) || !C7384Etj.areEqual(this.scope, fillAt.scope) || !C7384Etj.areEqual(this.text, fillAt.text) || this.mode != fillAt.mode) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ FillAt copy$default(FillAt fillAt, Point point, CoordinateScope coordinateScope, String str, TextMode textMode, int i, Object obj) {
            if ((i & 1) != 0) {
                point = fillAt.point;
            }
            if ((i & 2) != 0) {
                coordinateScope = fillAt.scope;
            }
            if ((i & 4) != 0) {
                str = fillAt.text;
            }
            if ((i & 8) != 0) {
                textMode = fillAt.mode;
            }
            return fillAt.copy(point, coordinateScope, str, textMode);
        }

        public final Point component1() {
            return this.point;
        }

        public final CoordinateScope component2() {
            return this.scope;
        }

        public final String component3() {
            return this.text;
        }

        public final TextMode component4() {
            return this.mode;
        }

        public final TextMode getMode() {
            return this.mode;
        }

        public final Point getPoint() {
            return this.point;
        }

        public final CoordinateScope getScope() {
            return this.scope;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.mode, AnonymousClass005.A0I(this.text, AnonymousClass005.A0F(this.scope, AnonymousClass005.A0E(this.point))));
        }

        public String toString() {
            Point point = this.point;
            CoordinateScope coordinateScope = this.scope;
            String str = this.text;
            TextMode textMode = this.mode;
            StringBuilder sbA0f = C3cG.A0f(point, "FillAt(point=");
            AbstractC7609F5w.A1M(sbA0f, coordinateScope);
            sbA0f.append(", text=");
            sbA0f.append(str);
            return C3cJ.A0L(textMode, ", mode=", sbA0f);
        }

        public FillAt(Point point, CoordinateScope coordinateScope, String str, TextMode textMode) {
            AnonymousClass005.A14(point, coordinateScope, str, textMode);
            this.point = point;
            this.scope = coordinateScope;
            this.text = str;
            this.mode = textMode;
        }

        public final FillAt copy(Point point, CoordinateScope coordinateScope, String str, TextMode textMode) {
            AnonymousClass005.A14(point, coordinateScope, str, textMode);
            return new FillAt(point, coordinateScope, str, textMode);
        }
    }

    public final class Focus extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;

        public Focus(ElementRef elementRef) {
            C7384Etj.A0Y(elementRef, 0);
            this.element = elementRef;
        }

        public final Focus copy(ElementRef elementRef) {
            C7384Etj.A0Y(elementRef, 0);
            return new Focus(elementRef);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Focus) && C7384Etj.areEqual(this.element, ((Focus) obj).element));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Focus copy$default(Focus focus, ElementRef elementRef, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = focus.element;
            }
            C7384Etj.A0Y(elementRef, 0);
            return new Focus(elementRef);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public int hashCode() {
            return this.element.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Focus(element=", this.element);
        }
    }

    public final class History extends Command {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final int delta;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof History) && this.delta == ((History) obj).delta);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ History copy$default(History history, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = history.delta;
            }
            return new History(i);
        }

        public final int component1() {
            return this.delta;
        }

        public final History copy(int i) {
            return new History(i);
        }

        public final int getDelta() {
            return this.delta;
        }

        public int hashCode() {
            return this.delta;
        }

        public String toString() {
            return FGI.A0I("History(delta=", this.delta, ")");
        }

        public History(int i) {
            this.delta = i;
        }
    }

    public final class Hover extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;

        public Hover(ElementRef elementRef) {
            C7384Etj.A0Y(elementRef, 0);
            this.element = elementRef;
        }

        public final Hover copy(ElementRef elementRef) {
            C7384Etj.A0Y(elementRef, 0);
            return new Hover(elementRef);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Hover) && C7384Etj.areEqual(this.element, ((Hover) obj).element));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Hover copy$default(Hover hover, ElementRef elementRef, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = hover.element;
            }
            C7384Etj.A0Y(elementRef, 0);
            return new Hover(elementRef);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public int hashCode() {
            return this.element.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Hover(element=", this.element);
        }
    }

    public final class Info extends Command {
        public static final int $stable = 0;
        public static final Info INSTANCE = new Info();
    }

    public final class Navigate extends Command {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String url;

        public Navigate(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final Navigate copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Navigate(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Navigate) && C7384Etj.areEqual(this.url, ((Navigate) obj).url));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Navigate copy$default(Navigate navigate, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigate.url;
            }
            C7384Etj.A0Y(str, 0);
            return new Navigate(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return C60O.A0r("Navigate(url=", this.url);
        }
    }

    public final class Observe extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ObserveOptions options;

        public Observe(ObserveOptions observeOptions) {
            C7384Etj.A0Y(observeOptions, 0);
            this.options = observeOptions;
        }

        public final Observe copy(ObserveOptions observeOptions) {
            C7384Etj.A0Y(observeOptions, 0);
            return new Observe(observeOptions);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Observe) && C7384Etj.areEqual(this.options, ((Observe) obj).options));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Observe copy$default(Observe observe, ObserveOptions observeOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                observeOptions = observe.options;
            }
            C7384Etj.A0Y(observeOptions, 0);
            return new Observe(observeOptions);
        }

        public final ObserveOptions component1() {
            return this.options;
        }

        public final ObserveOptions getOptions() {
            return this.options;
        }

        public int hashCode() {
            return this.options.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Observe(options=", this.options);
        }
    }

    public final class Pdf extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final PdfOptions options;

        public Pdf(PdfOptions pdfOptions) {
            C7384Etj.A0Y(pdfOptions, 0);
            this.options = pdfOptions;
        }

        public final Pdf copy(PdfOptions pdfOptions) {
            C7384Etj.A0Y(pdfOptions, 0);
            return new Pdf(pdfOptions);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Pdf) && C7384Etj.areEqual(this.options, ((Pdf) obj).options));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Pdf copy$default(Pdf pdf, PdfOptions pdfOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                pdfOptions = pdf.options;
            }
            C7384Etj.A0Y(pdfOptions, 0);
            return new Pdf(pdfOptions);
        }

        public final PdfOptions component1() {
            return this.options;
        }

        public final PdfOptions getOptions() {
            return this.options;
        }

        public int hashCode() {
            return this.options.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Pdf(options=", this.options);
        }
    }

    public final class PointerPath extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final PointerPathAction action;
        public final ChallengeProof challengeProof;
        public final FKC clickHoldMs;
        public final PointerMotionProfile motionProfile;
        public final List<Point> points;
        public final CoordinateScope scope;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PointerPath) {
                    PointerPath pointerPath = (PointerPath) obj;
                    if (this.action != pointerPath.action || !C7384Etj.areEqual(this.points, pointerPath.points) || !C7384Etj.areEqual(this.scope, pointerPath.scope) || this.motionProfile != pointerPath.motionProfile || !C7384Etj.areEqual(this.clickHoldMs, pointerPath.clickHoldMs) || !C7384Etj.areEqual(this.challengeProof, pointerPath.challengeProof)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-xKlDIQ0$default, reason: not valid java name */
        public static /* synthetic */ PointerPath m3307copyxKlDIQ0$default(PointerPath pointerPath, PointerPathAction pointerPathAction, List list, CoordinateScope coordinateScope, PointerMotionProfile pointerMotionProfile, FKC fkc, ChallengeProof challengeProof, int i, Object obj) {
            if ((i & 1) != 0) {
                pointerPathAction = pointerPath.action;
            }
            if ((i & 2) != 0) {
                list = pointerPath.points;
            }
            if ((i & 4) != 0) {
                coordinateScope = pointerPath.scope;
            }
            if ((i & 8) != 0) {
                pointerMotionProfile = pointerPath.motionProfile;
            }
            if ((i & 16) != 0) {
                fkc = pointerPath.clickHoldMs;
            }
            if ((i & 32) != 0) {
                challengeProof = pointerPath.challengeProof;
            }
            return pointerPath.m3309copyxKlDIQ0(pointerPathAction, list, coordinateScope, pointerMotionProfile, fkc, challengeProof);
        }

        public final PointerPathAction component1() {
            return this.action;
        }

        public final List<Point> component2() {
            return this.points;
        }

        public final CoordinateScope component3() {
            return this.scope;
        }

        public final PointerMotionProfile component4() {
            return this.motionProfile;
        }

        /* renamed from: component5-0hXNFcg, reason: not valid java name */
        public final FKC m3308component50hXNFcg() {
            return this.clickHoldMs;
        }

        public final ChallengeProof component6() {
            return this.challengeProof;
        }

        public final PointerPathAction getAction() {
            return this.action;
        }

        public final ChallengeProof getChallengeProof() {
            return this.challengeProof;
        }

        /* renamed from: getClickHoldMs-0hXNFcg, reason: not valid java name */
        public final FKC m3310getClickHoldMs0hXNFcg() {
            return this.clickHoldMs;
        }

        public final PointerMotionProfile getMotionProfile() {
            return this.motionProfile;
        }

        public final List<Point> getPoints() {
            return this.points;
        }

        public final CoordinateScope getScope() {
            return this.scope;
        }

        public int hashCode() {
            int iA0F = AnonymousClass005.A0F(this.motionProfile, AnonymousClass005.A0F(this.scope, AnonymousClass005.A0F(this.points, AnonymousClass005.A0E(this.action))));
            FKC fkc = this.clickHoldMs;
            return ((iA0F + (fkc == null ? 0 : fkc.A00)) * 31) + C3cH.A02(this.challengeProof);
        }

        public String toString() {
            PointerPathAction pointerPathAction = this.action;
            List<Point> list = this.points;
            CoordinateScope coordinateScope = this.scope;
            PointerMotionProfile pointerMotionProfile = this.motionProfile;
            FKC fkc = this.clickHoldMs;
            ChallengeProof challengeProof = this.challengeProof;
            StringBuilder sbA0f = C3cG.A0f(pointerPathAction, "PointerPath(action=");
            sbA0f.append(", points=");
            sbA0f.append(list);
            AbstractC7609F5w.A1M(sbA0f, coordinateScope);
            sbA0f.append(", motionProfile=");
            sbA0f.append(pointerMotionProfile);
            sbA0f.append(", clickHoldMs=");
            sbA0f.append(fkc);
            return C3cJ.A0L(challengeProof, ", challengeProof=", sbA0f);
        }

        public PointerPath(PointerPathAction pointerPathAction, List<Point> list, CoordinateScope coordinateScope, PointerMotionProfile pointerMotionProfile, FKC fkc, ChallengeProof challengeProof) {
            AnonymousClass005.A14(pointerPathAction, list, coordinateScope, pointerMotionProfile);
            this.action = pointerPathAction;
            this.points = list;
            this.scope = coordinateScope;
            this.motionProfile = pointerMotionProfile;
            this.clickHoldMs = fkc;
            this.challengeProof = challengeProof;
        }

        /* renamed from: copy-xKlDIQ0, reason: not valid java name */
        public final PointerPath m3309copyxKlDIQ0(PointerPathAction pointerPathAction, List<Point> list, CoordinateScope coordinateScope, PointerMotionProfile pointerMotionProfile, FKC fkc, ChallengeProof challengeProof) {
            AnonymousClass005.A14(pointerPathAction, list, coordinateScope, pointerMotionProfile);
            return new PointerPath(pointerPathAction, list, coordinateScope, pointerMotionProfile, fkc, challengeProof);
        }

        public /* synthetic */ PointerPath(PointerPathAction pointerPathAction, List list, CoordinateScope coordinateScope, PointerMotionProfile pointerMotionProfile, FKC fkc, ChallengeProof challengeProof, C06H c06h) {
            this(pointerPathAction, list, coordinateScope, pointerMotionProfile, fkc, challengeProof);
        }
    }

    public final class Press extends Command {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final List<KeyChord> keys;
        public final InputTarget target;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Press) {
                    Press press = (Press) obj;
                    if (!C7384Etj.areEqual(this.target, press.target) || !C7384Etj.areEqual(this.keys, press.keys)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Press copy$default(Press press, InputTarget inputTarget, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                inputTarget = press.target;
            }
            if ((i & 2) != 0) {
                list = press.keys;
            }
            AnonymousClass003.A0u(inputTarget, list);
            return new Press(inputTarget, list);
        }

        public final InputTarget component1() {
            return this.target;
        }

        public final List<KeyChord> component2() {
            return this.keys;
        }

        public final List<KeyChord> getKeys() {
            return this.keys;
        }

        public final InputTarget getTarget() {
            return this.target;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.keys, AnonymousClass005.A0E(this.target));
        }

        public String toString() {
            return C3cJ.A0L(this.keys, ", keys=", C3cG.A0f(this.target, "Press(target="));
        }

        public Press(InputTarget inputTarget, List<KeyChord> list) {
            AnonymousClass003.A0u(inputTarget, list);
            this.target = inputTarget;
            this.keys = list;
        }

        public final Press copy(InputTarget inputTarget, List<KeyChord> list) {
            AnonymousClass003.A0u(inputTarget, list);
            return new Press(inputTarget, list);
        }
    }

    public final class ReadElement extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;
        public final ElementReadKind read;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ReadElement) {
                    ReadElement readElement = (ReadElement) obj;
                    if (!C7384Etj.areEqual(this.element, readElement.element) || !C7384Etj.areEqual(this.read, readElement.read)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ReadElement copy$default(ReadElement readElement, ElementRef elementRef, ElementReadKind elementReadKind, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = readElement.element;
            }
            if ((i & 2) != 0) {
                elementReadKind = readElement.read;
            }
            AnonymousClass003.A0u(elementRef, elementReadKind);
            return new ReadElement(elementRef, elementReadKind);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final ElementReadKind component2() {
            return this.read;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public final ElementReadKind getRead() {
            return this.read;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.read, AnonymousClass005.A0E(this.element));
        }

        public String toString() {
            return C3cJ.A0L(this.read, ", read=", C3cG.A0f(this.element, "ReadElement(element="));
        }

        public ReadElement(ElementRef elementRef, ElementReadKind elementReadKind) {
            AnonymousClass003.A0u(elementRef, elementReadKind);
            this.element = elementRef;
            this.read = elementReadKind;
        }

        public final ReadElement copy(ElementRef elementRef, ElementReadKind elementReadKind) {
            AnonymousClass003.A0u(elementRef, elementReadKind);
            return new ReadElement(elementRef, elementReadKind);
        }
    }

    public final class ReadElementFields extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;
        public final List<ElementReadKind> reads;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ReadElementFields) {
                    ReadElementFields readElementFields = (ReadElementFields) obj;
                    if (!C7384Etj.areEqual(this.element, readElementFields.element) || !C7384Etj.areEqual(this.reads, readElementFields.reads)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ReadElementFields copy$default(ReadElementFields readElementFields, ElementRef elementRef, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = readElementFields.element;
            }
            if ((i & 2) != 0) {
                list = readElementFields.reads;
            }
            AnonymousClass003.A0u(elementRef, list);
            return new ReadElementFields(elementRef, list);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final List<ElementReadKind> component2() {
            return this.reads;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public final List<ElementReadKind> getReads() {
            return this.reads;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.reads, AnonymousClass005.A0E(this.element));
        }

        public String toString() {
            return C3cJ.A0L(this.reads, ", reads=", C3cG.A0f(this.element, "ReadElementFields(element="));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ReadElementFields(ElementRef elementRef, List<? extends ElementReadKind> list) {
            AnonymousClass003.A0u(elementRef, list);
            this.element = elementRef;
            this.reads = list;
        }

        public final ReadElementFields copy(ElementRef elementRef, List<? extends ElementReadKind> list) {
            AnonymousClass003.A0u(elementRef, list);
            return new ReadElementFields(elementRef, list);
        }
    }

    public final class ReadPage extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final CaptureOptions capture;
        public final String query;
        public final PageReadKind read;

        public ReadPage(PageReadKind pageReadKind, String str, CaptureOptions captureOptions) {
            C7384Etj.A0Y(pageReadKind, 0);
            this.read = pageReadKind;
            this.query = str;
            this.capture = captureOptions;
        }

        public final ReadPage copy(PageReadKind pageReadKind, String str, CaptureOptions captureOptions) {
            C7384Etj.A0Y(pageReadKind, 0);
            return new ReadPage(pageReadKind, str, captureOptions);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ReadPage) {
                    ReadPage readPage = (ReadPage) obj;
                    if (this.read != readPage.read || !C7384Etj.areEqual(this.query, readPage.query) || !C7384Etj.areEqual(this.capture, readPage.capture)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ReadPage copy$default(ReadPage readPage, PageReadKind pageReadKind, String str, CaptureOptions captureOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                pageReadKind = readPage.read;
            }
            if ((i & 2) != 0) {
                str = readPage.query;
            }
            if ((i & 4) != 0) {
                captureOptions = readPage.capture;
            }
            return readPage.copy(pageReadKind, str, captureOptions);
        }

        public final PageReadKind component1() {
            return this.read;
        }

        public final String component2() {
            return this.query;
        }

        public final CaptureOptions component3() {
            return this.capture;
        }

        public final CaptureOptions getCapture() {
            return this.capture;
        }

        public final String getQuery() {
            return this.query;
        }

        public final PageReadKind getRead() {
            return this.read;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0E(this.read) + AnonymousClass006.A0G(this.query)) * 31) + C3cH.A02(this.capture);
        }

        public String toString() {
            PageReadKind pageReadKind = this.read;
            String str = this.query;
            CaptureOptions captureOptions = this.capture;
            StringBuilder sbA0f = C3cG.A0f(pageReadKind, "ReadPage(read=");
            sbA0f.append(", query=");
            sbA0f.append(str);
            return C3cJ.A0L(captureOptions, ", capture=", sbA0f);
        }
    }

    public final class Reload extends Command {
        public static final int $stable = 0;
        public static final Reload INSTANCE = new Reload();
    }

    public final class ResumeSubmit extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final SubmitContinuation continuation;

        public ResumeSubmit(SubmitContinuation submitContinuation) {
            C7384Etj.A0Y(submitContinuation, 0);
            this.continuation = submitContinuation;
        }

        public final ResumeSubmit copy(SubmitContinuation submitContinuation) {
            C7384Etj.A0Y(submitContinuation, 0);
            return new ResumeSubmit(submitContinuation);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ResumeSubmit) && C7384Etj.areEqual(this.continuation, ((ResumeSubmit) obj).continuation));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ResumeSubmit copy$default(ResumeSubmit resumeSubmit, SubmitContinuation submitContinuation, int i, Object obj) {
            if ((i & 1) != 0) {
                submitContinuation = resumeSubmit.continuation;
            }
            C7384Etj.A0Y(submitContinuation, 0);
            return new ResumeSubmit(submitContinuation);
        }

        public final SubmitContinuation component1() {
            return this.continuation;
        }

        public final SubmitContinuation getContinuation() {
            return this.continuation;
        }

        public int hashCode() {
            return this.continuation.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("ResumeSubmit(continuation=", this.continuation);
        }
    }

    public final class Scroll extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ScrollOperation operation;

        public Scroll(ScrollOperation scrollOperation) {
            C7384Etj.A0Y(scrollOperation, 0);
            this.operation = scrollOperation;
        }

        public final Scroll copy(ScrollOperation scrollOperation) {
            C7384Etj.A0Y(scrollOperation, 0);
            return new Scroll(scrollOperation);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Scroll) && C7384Etj.areEqual(this.operation, ((Scroll) obj).operation));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Scroll copy$default(Scroll scroll, ScrollOperation scrollOperation, int i, Object obj) {
            if ((i & 1) != 0) {
                scrollOperation = scroll.operation;
            }
            C7384Etj.A0Y(scrollOperation, 0);
            return new Scroll(scrollOperation);
        }

        public final ScrollOperation component1() {
            return this.operation;
        }

        public final ScrollOperation getOperation() {
            return this.operation;
        }

        public int hashCode() {
            return this.operation.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Scroll(operation=", this.operation);
        }
    }

    public final class ScrollAt extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ScrollDirection direction;
        public final int pixels;
        public final Point point;
        public final CoordinateScope scope;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ScrollAt) {
                    ScrollAt scrollAt = (ScrollAt) obj;
                    if (!C7384Etj.areEqual(this.point, scrollAt.point) || !C7384Etj.areEqual(this.scope, scrollAt.scope) || this.direction != scrollAt.direction || this.pixels != scrollAt.pixels) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* renamed from: copy-hJeF8fQ$default, reason: not valid java name */
        public static /* synthetic */ ScrollAt m3311copyhJeF8fQ$default(ScrollAt scrollAt, Point point, CoordinateScope coordinateScope, ScrollDirection scrollDirection, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                point = scrollAt.point;
            }
            if ((i2 & 2) != 0) {
                coordinateScope = scrollAt.scope;
            }
            if ((i2 & 4) != 0) {
                scrollDirection = scrollAt.direction;
            }
            if ((i2 & 8) != 0) {
                i = scrollAt.pixels;
            }
            AnonymousClass005.A0x(point, coordinateScope, scrollDirection);
            return new ScrollAt(point, coordinateScope, scrollDirection, i);
        }

        public final Point component1() {
            return this.point;
        }

        public final CoordinateScope component2() {
            return this.scope;
        }

        public final ScrollDirection component3() {
            return this.direction;
        }

        /* renamed from: component4-pVg5ArA, reason: not valid java name */
        public final int m3312component4pVg5ArA() {
            return this.pixels;
        }

        public final ScrollDirection getDirection() {
            return this.direction;
        }

        /* renamed from: getPixels-pVg5ArA, reason: not valid java name */
        public final int m3314getPixelspVg5ArA() {
            return this.pixels;
        }

        public final Point getPoint() {
            return this.point;
        }

        public final CoordinateScope getScope() {
            return this.scope;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.direction, AnonymousClass005.A0F(this.scope, AnonymousClass005.A0E(this.point))) + this.pixels;
        }

        public String toString() {
            Point point = this.point;
            CoordinateScope coordinateScope = this.scope;
            ScrollDirection scrollDirection = this.direction;
            String strValueOf = String.valueOf(BV4.A03(this.pixels));
            StringBuilder sbA0f = C3cG.A0f(point, "ScrollAt(point=");
            AbstractC7609F5w.A1M(sbA0f, coordinateScope);
            sbA0f.append(", direction=");
            sbA0f.append(scrollDirection);
            return C3cJ.A0N(", pixels=", strValueOf, sbA0f);
        }

        public ScrollAt(Point point, CoordinateScope coordinateScope, ScrollDirection scrollDirection, int i) {
            AnonymousClass005.A0x(point, coordinateScope, scrollDirection);
            this.point = point;
            this.scope = coordinateScope;
            this.direction = scrollDirection;
            this.pixels = i;
        }

        /* renamed from: copy-hJeF8fQ, reason: not valid java name */
        public final ScrollAt m3313copyhJeF8fQ(Point point, CoordinateScope coordinateScope, ScrollDirection scrollDirection, int i) {
            AnonymousClass005.A0x(point, coordinateScope, scrollDirection);
            return new ScrollAt(point, coordinateScope, scrollDirection, i);
        }

        public /* synthetic */ ScrollAt(Point point, CoordinateScope coordinateScope, ScrollDirection scrollDirection, int i, C06H c06h) {
            this(point, coordinateScope, scrollDirection, i);
        }
    }

    public final class Select extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;
        public final String value;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Select) {
                    Select select = (Select) obj;
                    if (!C7384Etj.areEqual(this.element, select.element) || !C7384Etj.areEqual(this.value, select.value)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Select copy$default(Select select, ElementRef elementRef, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = select.element;
            }
            if ((i & 2) != 0) {
                str = select.value;
            }
            AnonymousClass003.A0u(elementRef, str);
            return new Select(elementRef, str);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final String component2() {
            return this.value;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.value, AnonymousClass005.A0E(this.element));
        }

        public String toString() {
            return C3cJ.A0N(", value=", this.value, C3cG.A0f(this.element, "Select(element="));
        }

        public Select(ElementRef elementRef, String str) {
            AnonymousClass003.A0u(elementRef, str);
            this.element = elementRef;
            this.value = str;
        }

        public final Select copy(ElementRef elementRef, String str) {
            AnonymousClass003.A0u(elementRef, str);
            return new Select(elementRef, str);
        }
    }

    public final class SetChecked extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final boolean checked;
        public final ElementRef element;

        public SetChecked(ElementRef elementRef, boolean z) {
            C7384Etj.A0Y(elementRef, 0);
            this.element = elementRef;
            this.checked = z;
        }

        public final SetChecked copy(ElementRef elementRef, boolean z) {
            C7384Etj.A0Y(elementRef, 0);
            return new SetChecked(elementRef, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SetChecked) {
                    SetChecked setChecked = (SetChecked) obj;
                    if (!C7384Etj.areEqual(this.element, setChecked.element) || this.checked != setChecked.checked) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ SetChecked copy$default(SetChecked setChecked, ElementRef elementRef, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = setChecked.element;
            }
            if ((i & 2) != 0) {
                z = setChecked.checked;
            }
            C7384Etj.A0Y(elementRef, 0);
            return new SetChecked(elementRef, z);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final boolean component2() {
            return this.checked;
        }

        public final boolean getChecked() {
            return this.checked;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.element), this.checked);
        }

        public String toString() {
            ElementRef elementRef = this.element;
            return C8j5.A0W(", checked=", C3cG.A0f(elementRef, "SetChecked(element="), this.checked);
        }
    }

    public final class ShopPayApprove extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final String approvalId;
        public final DocumentKey expectedDocument;
        public final String expectedOrigin;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShopPayApprove) {
                    ShopPayApprove shopPayApprove = (ShopPayApprove) obj;
                    if (!C7384Etj.areEqual(this.expectedDocument, shopPayApprove.expectedDocument) || !C7384Etj.areEqual(this.expectedOrigin, shopPayApprove.expectedOrigin) || !C7384Etj.areEqual(this.approvalId, shopPayApprove.approvalId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ ShopPayApprove copy$default(ShopPayApprove shopPayApprove, DocumentKey documentKey, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                documentKey = shopPayApprove.expectedDocument;
            }
            if ((i & 2) != 0) {
                str = shopPayApprove.expectedOrigin;
            }
            if ((i & 4) != 0) {
                str2 = shopPayApprove.approvalId;
            }
            return shopPayApprove.copy(documentKey, str, str2);
        }

        public final DocumentKey component1() {
            return this.expectedDocument;
        }

        public final String component2() {
            return this.expectedOrigin;
        }

        public final String component3() {
            return this.approvalId;
        }

        public final String getApprovalId() {
            return this.approvalId;
        }

        public final DocumentKey getExpectedDocument() {
            return this.expectedDocument;
        }

        public final String getExpectedOrigin() {
            return this.expectedOrigin;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.approvalId, AnonymousClass005.A0I(this.expectedOrigin, AnonymousClass005.A0E(this.expectedDocument)));
        }

        public String toString() {
            DocumentKey documentKey = this.expectedDocument;
            String str = this.expectedOrigin;
            String str2 = this.approvalId;
            StringBuilder sbA0f = C3cG.A0f(documentKey, "ShopPayApprove(expectedDocument=");
            sbA0f.append(", expectedOrigin=");
            sbA0f.append(str);
            return C3cJ.A0N(", approvalId=", str2, sbA0f);
        }

        public ShopPayApprove(DocumentKey documentKey, String str, String str2) {
            AnonymousClass005.A0x(documentKey, str, str2);
            this.expectedDocument = documentKey;
            this.expectedOrigin = str;
            this.approvalId = str2;
        }

        public final ShopPayApprove copy(DocumentKey documentKey, String str, String str2) {
            AnonymousClass005.A0x(documentKey, str, str2);
            return new ShopPayApprove(documentKey, str, str2);
        }
    }

    public final class ShopifyCheckout extends Command {
        public static final int $stable = 0;
        public static final ShopifyCheckout INSTANCE = new ShopifyCheckout();
    }

    public final class Upload extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;
        public final List<FileRef> files;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Upload) {
                    Upload upload = (Upload) obj;
                    if (!C7384Etj.areEqual(this.element, upload.element) || !C7384Etj.areEqual(this.files, upload.files)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Upload copy$default(Upload upload, ElementRef elementRef, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = upload.element;
            }
            if ((i & 2) != 0) {
                list = upload.files;
            }
            AnonymousClass003.A0u(elementRef, list);
            return new Upload(elementRef, list);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final List<FileRef> component2() {
            return this.files;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public final List<FileRef> getFiles() {
            return this.files;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.files, AnonymousClass005.A0E(this.element));
        }

        public String toString() {
            return C3cJ.A0L(this.files, ", files=", C3cG.A0f(this.element, "Upload(element="));
        }

        public Upload(ElementRef elementRef, List<FileRef> list) {
            AnonymousClass003.A0u(elementRef, list);
            this.element = elementRef;
            this.files = list;
        }

        public final Upload copy(ElementRef elementRef, List<FileRef> list) {
            AnonymousClass003.A0u(elementRef, list);
            return new Upload(elementRef, list);
        }
    }

    public final class UploadProbe extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;

        public UploadProbe(ElementRef elementRef) {
            C7384Etj.A0Y(elementRef, 0);
            this.element = elementRef;
        }

        public final UploadProbe copy(ElementRef elementRef) {
            C7384Etj.A0Y(elementRef, 0);
            return new UploadProbe(elementRef);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof UploadProbe) && C7384Etj.areEqual(this.element, ((UploadProbe) obj).element));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ UploadProbe copy$default(UploadProbe uploadProbe, ElementRef elementRef, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = uploadProbe.element;
            }
            C7384Etj.A0Y(elementRef, 0);
            return new UploadProbe(elementRef);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public int hashCode() {
            return this.element.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("UploadProbe(element=", this.element);
        }
    }

    public final class VisualProgram extends Command {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final boolean feedback;
        public final String source;
        public final int timeoutMs;

        /* renamed from: copy-OsBMiQA, reason: not valid java name */
        public final VisualProgram m3317copyOsBMiQA(String str, int i, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new VisualProgram(str, i, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof VisualProgram) {
                    VisualProgram visualProgram = (VisualProgram) obj;
                    if (!C7384Etj.areEqual(this.source, visualProgram.source) || this.timeoutMs != visualProgram.timeoutMs || this.feedback != visualProgram.feedback) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* renamed from: copy-OsBMiQA$default, reason: not valid java name */
        public static /* synthetic */ VisualProgram m3315copyOsBMiQA$default(VisualProgram visualProgram, String str, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = visualProgram.source;
            }
            if ((i2 & 2) != 0) {
                i = visualProgram.timeoutMs;
            }
            if ((i2 & 4) != 0) {
                z = visualProgram.feedback;
            }
            return visualProgram.m3317copyOsBMiQA(str, i, z);
        }

        public final String component1() {
            return this.source;
        }

        /* renamed from: component2-pVg5ArA, reason: not valid java name */
        public final int m3316component2pVg5ArA() {
            return this.timeoutMs;
        }

        public final boolean component3() {
            return this.feedback;
        }

        public final boolean getFeedback() {
            return this.feedback;
        }

        public final String getSource() {
            return this.source;
        }

        /* renamed from: getTimeoutMs-pVg5ArA, reason: not valid java name */
        public final int m3318getTimeoutMspVg5ArA() {
            return this.timeoutMs;
        }

        public int hashCode() {
            return C0KA.A00((AnonymousClass001.A0G(this.source) + this.timeoutMs) * 31, this.feedback);
        }

        public String toString() {
            String str = this.source;
            String strValueOf = String.valueOf(BV4.A03(this.timeoutMs));
            boolean z = this.feedback;
            StringBuilder sbA0x = C3cI.A0x("VisualProgram(source=", str);
            sbA0x.append(", timeoutMs=");
            sbA0x.append(strValueOf);
            return C8j5.A0W(", feedback=", sbA0x, z);
        }

        public /* synthetic */ VisualProgram(String str, int i, boolean z, C06H c06h) {
            this(str, i, z);
        }

        public VisualProgram(String str, int i, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.source = str;
            this.timeoutMs = i;
            this.feedback = z;
        }
    }

    public final class Wait extends Command {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final WaitCondition condition;
        public final WaitOptions options;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Wait) {
                    Wait wait = (Wait) obj;
                    if (!C7384Etj.areEqual(this.condition, wait.condition) || !C7384Etj.areEqual(this.options, wait.options)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Wait copy$default(Wait wait, WaitCondition waitCondition, WaitOptions waitOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                waitCondition = wait.condition;
            }
            if ((i & 2) != 0) {
                waitOptions = wait.options;
            }
            AnonymousClass003.A0u(waitCondition, waitOptions);
            return new Wait(waitCondition, waitOptions);
        }

        public final WaitCondition component1() {
            return this.condition;
        }

        public final WaitOptions component2() {
            return this.options;
        }

        public final WaitCondition getCondition() {
            return this.condition;
        }

        public final WaitOptions getOptions() {
            return this.options;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.options, AnonymousClass005.A0E(this.condition));
        }

        public String toString() {
            return C3cJ.A0L(this.options, ", options=", C3cG.A0f(this.condition, "Wait(condition="));
        }

        public Wait(WaitCondition waitCondition, WaitOptions waitOptions) {
            AnonymousClass003.A0u(waitCondition, waitOptions);
            this.condition = waitCondition;
            this.options = waitOptions;
        }

        public final Wait copy(WaitCondition waitCondition, WaitOptions waitOptions) {
            AnonymousClass003.A0u(waitCondition, waitOptions);
            return new Wait(waitCondition, waitOptions);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public Command() {
    }

    public /* synthetic */ Command(C06H c06h) {
    }
}
