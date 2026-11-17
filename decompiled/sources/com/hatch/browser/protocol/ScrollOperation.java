package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class ScrollOperation {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class By extends ScrollOperation {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ScrollDirection direction;
        public final int pixels;
        public final ScrollSpeed speed;
        public final InputTarget target;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof By) {
                    By by = (By) obj;
                    if (!C7384Etj.areEqual(this.target, by.target) || this.direction != by.direction || this.pixels != by.pixels || this.speed != by.speed) {
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

        /* renamed from: copy-BzPDsQc$default, reason: not valid java name */
        public static /* synthetic */ By m3726copyBzPDsQc$default(By by, InputTarget inputTarget, ScrollDirection scrollDirection, int i, ScrollSpeed scrollSpeed, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                inputTarget = by.target;
            }
            if ((i2 & 2) != 0) {
                scrollDirection = by.direction;
            }
            if ((i2 & 4) != 0) {
                i = by.pixels;
            }
            if ((i2 & 8) != 0) {
                scrollSpeed = by.speed;
            }
            AnonymousClass003.A0u(inputTarget, scrollDirection);
            return new By(inputTarget, scrollDirection, i, scrollSpeed);
        }

        public final InputTarget component1() {
            return this.target;
        }

        public final ScrollDirection component2() {
            return this.direction;
        }

        /* renamed from: component3-pVg5ArA, reason: not valid java name */
        public final int m3727component3pVg5ArA() {
            return this.pixels;
        }

        public final ScrollSpeed component4() {
            return this.speed;
        }

        public final ScrollDirection getDirection() {
            return this.direction;
        }

        /* renamed from: getPixels-pVg5ArA, reason: not valid java name */
        public final int m3729getPixelspVg5ArA() {
            return this.pixels;
        }

        public final ScrollSpeed getSpeed() {
            return this.speed;
        }

        public final InputTarget getTarget() {
            return this.target;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.direction, AnonymousClass005.A0E(this.target)) + this.pixels) * 31) + AnonymousClass006.A0D(this.speed);
        }

        public String toString() {
            InputTarget inputTarget = this.target;
            ScrollDirection scrollDirection = this.direction;
            String strValueOf = String.valueOf(BV4.A03(this.pixels));
            ScrollSpeed scrollSpeed = this.speed;
            StringBuilder sbA0f = C3cG.A0f(inputTarget, "By(target=");
            sbA0f.append(", direction=");
            sbA0f.append(scrollDirection);
            sbA0f.append(", pixels=");
            sbA0f.append(strValueOf);
            return C3cJ.A0L(scrollSpeed, ", speed=", sbA0f);
        }

        public By(InputTarget inputTarget, ScrollDirection scrollDirection, int i, ScrollSpeed scrollSpeed) {
            AnonymousClass003.A0u(inputTarget, scrollDirection);
            this.target = inputTarget;
            this.direction = scrollDirection;
            this.pixels = i;
            this.speed = scrollSpeed;
        }

        /* renamed from: copy-BzPDsQc, reason: not valid java name */
        public final By m3728copyBzPDsQc(InputTarget inputTarget, ScrollDirection scrollDirection, int i, ScrollSpeed scrollSpeed) {
            AnonymousClass003.A0u(inputTarget, scrollDirection);
            return new By(inputTarget, scrollDirection, i, scrollSpeed);
        }

        public /* synthetic */ By(InputTarget inputTarget, ScrollDirection scrollDirection, int i, ScrollSpeed scrollSpeed, C06H c06h) {
            this(inputTarget, scrollDirection, i, scrollSpeed);
        }
    }

    public final class PageToEdge extends ScrollOperation {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final PageEdge edge;

        public PageToEdge(PageEdge pageEdge) {
            C7384Etj.A0Y(pageEdge, 0);
            this.edge = pageEdge;
        }

        public final PageToEdge copy(PageEdge pageEdge) {
            C7384Etj.A0Y(pageEdge, 0);
            return new PageToEdge(pageEdge);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof PageToEdge) && this.edge == ((PageToEdge) obj).edge);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ PageToEdge copy$default(PageToEdge pageToEdge, PageEdge pageEdge, int i, Object obj) {
            if ((i & 1) != 0) {
                pageEdge = pageToEdge.edge;
            }
            C7384Etj.A0Y(pageEdge, 0);
            return new PageToEdge(pageEdge);
        }

        public final PageEdge component1() {
            return this.edge;
        }

        public final PageEdge getEdge() {
            return this.edge;
        }

        public int hashCode() {
            return this.edge.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("PageToEdge(edge=", this.edge);
        }
    }

    public final class Reveal extends ScrollOperation {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final ElementRef element;

        public Reveal(ElementRef elementRef) {
            C7384Etj.A0Y(elementRef, 0);
            this.element = elementRef;
        }

        public final Reveal copy(ElementRef elementRef) {
            C7384Etj.A0Y(elementRef, 0);
            return new Reveal(elementRef);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Reveal) && C7384Etj.areEqual(this.element, ((Reveal) obj).element));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Reveal copy$default(Reveal reveal, ElementRef elementRef, int i, Object obj) {
            if ((i & 1) != 0) {
                elementRef = reveal.element;
            }
            C7384Etj.A0Y(elementRef, 0);
            return new Reveal(elementRef);
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
            return C3cJ.A0M("Reveal(element=", this.element);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public ScrollOperation() {
    }

    public /* synthetic */ ScrollOperation(C06H c06h) {
    }
}
