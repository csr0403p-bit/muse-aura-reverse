package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class InputTarget {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Element extends InputTarget {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;

        public Element(ElementRef elementRef) {
            C7384Etj.A0Y(elementRef, 0);
            this.element = elementRef;
        }

        public final Element copy(ElementRef elementRef) {
            C7384Etj.A0Y(elementRef, 0);
            return new Element(elementRef);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Element) && C7384Etj.areEqual(this.element, ((Element) obj).element));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Element copy$default(Element element, ElementRef elementRef, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = element.element;
            }
            C7384Etj.A0Y(elementRef, 0);
            return new Element(elementRef);
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
            return C3cJ.A0M("Element(element=", this.element);
        }
    }

    public final class Page extends InputTarget {
        public static final int $stable = 0;
        public static final Page INSTANCE = new Page();
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public InputTarget() {
    }

    public /* synthetic */ InputTarget(C06H c06h) {
    }
}
