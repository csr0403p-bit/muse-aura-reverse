package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class WaitCondition {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Delay extends WaitCondition {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final int durationMs;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Delay) && this.durationMs == ((Delay) obj).durationMs);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* renamed from: copy-WZ4Q5Ns$default, reason: not valid java name */
        public static /* synthetic */ Delay m3869copyWZ4Q5Ns$default(Delay delay, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = delay.durationMs;
            }
            return new Delay(i);
        }

        /* renamed from: component1-pVg5ArA, reason: not valid java name */
        public final int m3870component1pVg5ArA() {
            return this.durationMs;
        }

        /* renamed from: copy-WZ4Q5Ns, reason: not valid java name */
        public final Delay m3871copyWZ4Q5Ns(int i) {
            return new Delay(i);
        }

        /* renamed from: getDurationMs-pVg5ArA, reason: not valid java name */
        public final int m3872getDurationMspVg5ArA() {
            return this.durationMs;
        }

        public int hashCode() {
            return this.durationMs;
        }

        public String toString() {
            return C60O.A0r("Delay(durationMs=", String.valueOf(BV4.A03(this.durationMs)));
        }

        public Delay(int i) {
            this.durationMs = i;
        }

        public /* synthetic */ Delay(int i, C06H c06h) {
            this(i);
        }
    }

    public final class ElementState extends WaitCondition {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;
        public final com.hatch.browser.protocol.ElementState state;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ElementState) {
                    ElementState elementState = (ElementState) obj;
                    if (!C7384Etj.areEqual(this.element, elementState.element) || !C7384Etj.areEqual(this.state, elementState.state)) {
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

        public static /* synthetic */ ElementState copy$default(ElementState elementState, ElementRef elementRef, com.hatch.browser.protocol.ElementState elementState2, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = elementState.element;
            }
            if ((i & 2) != 0) {
                elementState2 = elementState.state;
            }
            AnonymousClass003.A0u(elementRef, elementState2);
            return new ElementState(elementRef, elementState2);
        }

        public final ElementRef component1() {
            return this.element;
        }

        public final com.hatch.browser.protocol.ElementState component2() {
            return this.state;
        }

        public final ElementRef getElement() {
            return this.element;
        }

        public final com.hatch.browser.protocol.ElementState getState() {
            return this.state;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.state, AnonymousClass005.A0E(this.element));
        }

        public String toString() {
            return C3cJ.A0L(this.state, ", state=", C3cG.A0f(this.element, "ElementState(element="));
        }

        public ElementState(ElementRef elementRef, com.hatch.browser.protocol.ElementState elementState) {
            AnonymousClass003.A0u(elementRef, elementState);
            this.element = elementRef;
            this.state = elementState;
        }

        public final ElementState copy(ElementRef elementRef, com.hatch.browser.protocol.ElementState elementState) {
            AnonymousClass003.A0u(elementRef, elementState);
            return new ElementState(elementRef, elementState);
        }
    }

    public final class PageTextAbsent extends WaitCondition {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String text;

        public PageTextAbsent(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final PageTextAbsent copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new PageTextAbsent(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof PageTextAbsent) && C7384Etj.areEqual(this.text, ((PageTextAbsent) obj).text));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ PageTextAbsent copy$default(PageTextAbsent pageTextAbsent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pageTextAbsent.text;
            }
            C7384Etj.A0Y(str, 0);
            return new PageTextAbsent(str);
        }

        public final String component1() {
            return this.text;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return C60O.A0r("PageTextAbsent(text=", this.text);
        }
    }

    public final class PageTextPresent extends WaitCondition {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String text;

        public PageTextPresent(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final PageTextPresent copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new PageTextPresent(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof PageTextPresent) && C7384Etj.areEqual(this.text, ((PageTextPresent) obj).text));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ PageTextPresent copy$default(PageTextPresent pageTextPresent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pageTextPresent.text;
            }
            C7384Etj.A0Y(str, 0);
            return new PageTextPresent(str);
        }

        public final String component1() {
            return this.text;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return C60O.A0r("PageTextPresent(text=", this.text);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public WaitCondition() {
    }

    public /* synthetic */ WaitCondition(C06H c06h) {
    }
}
