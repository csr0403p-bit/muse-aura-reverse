package com.hatch.browser.protocol;

import X.C06H;
import X.C0KA;
import X.FGI;

/* loaded from: classes6.dex */
public final class PdfOptions {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public boolean preferCssPageSize;
    public boolean printBackground;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdfOptions) {
                PdfOptions pdfOptions = (PdfOptions) obj;
                if (this.printBackground != pdfOptions.printBackground || this.preferCssPageSize != pdfOptions.preferCssPageSize) {
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

    public static /* synthetic */ PdfOptions copy$default(PdfOptions pdfOptions, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pdfOptions.printBackground;
        }
        if ((i & 2) != 0) {
            z2 = pdfOptions.preferCssPageSize;
        }
        return new PdfOptions(z, z2);
    }

    public final boolean component1() {
        return this.printBackground;
    }

    public final boolean component2() {
        return this.preferCssPageSize;
    }

    public final PdfOptions copy(boolean z, boolean z2) {
        return new PdfOptions(z, z2);
    }

    public final boolean getPreferCssPageSize() {
        return this.preferCssPageSize;
    }

    public final boolean getPrintBackground() {
        return this.printBackground;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A02(this.printBackground), this.preferCssPageSize);
    }

    public final void setPreferCssPageSize(boolean z) {
        this.preferCssPageSize = z;
    }

    public final void setPrintBackground(boolean z) {
        this.printBackground = z;
    }

    public String toString() {
        return FGI.A0p("PdfOptions(printBackground=", ", preferCssPageSize=", ")", this.printBackground, this.preferCssPageSize);
    }

    public PdfOptions(boolean z, boolean z2) {
        this.printBackground = z;
        this.preferCssPageSize = z2;
    }
}
