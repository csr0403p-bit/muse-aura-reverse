package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageCloseReceiptEnvelope {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int apiVersion;
    public PageCloseReceipt receipt;

    public PageCloseReceiptEnvelope(int i, PageCloseReceipt pageCloseReceipt) {
        C7384Etj.A0Y(pageCloseReceipt, 1);
        this.apiVersion = i;
        this.receipt = pageCloseReceipt;
    }

    /* renamed from: copy-qim9Vi0, reason: not valid java name */
    public final PageCloseReceiptEnvelope m3642copyqim9Vi0(int i, PageCloseReceipt pageCloseReceipt) {
        C7384Etj.A0Y(pageCloseReceipt, 1);
        return new PageCloseReceiptEnvelope(i, pageCloseReceipt);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageCloseReceiptEnvelope) {
                PageCloseReceiptEnvelope pageCloseReceiptEnvelope = (PageCloseReceiptEnvelope) obj;
                if (this.apiVersion != pageCloseReceiptEnvelope.apiVersion || !C7384Etj.areEqual(this.receipt, pageCloseReceiptEnvelope.receipt)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setReceipt(PageCloseReceipt pageCloseReceipt) {
        C7384Etj.A0Y(pageCloseReceipt, 0);
        this.receipt = pageCloseReceipt;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-qim9Vi0$default, reason: not valid java name */
    public static /* synthetic */ PageCloseReceiptEnvelope m3640copyqim9Vi0$default(PageCloseReceiptEnvelope pageCloseReceiptEnvelope, int i, PageCloseReceipt pageCloseReceipt, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pageCloseReceiptEnvelope.apiVersion;
        }
        if ((i2 & 2) != 0) {
            pageCloseReceipt = pageCloseReceiptEnvelope.receipt;
        }
        C7384Etj.A0Y(pageCloseReceipt, 1);
        return new PageCloseReceiptEnvelope(i, pageCloseReceipt);
    }

    /* renamed from: component1-pVg5ArA, reason: not valid java name */
    public final int m3641component1pVg5ArA() {
        return this.apiVersion;
    }

    public final PageCloseReceipt component2() {
        return this.receipt;
    }

    /* renamed from: getApiVersion-pVg5ArA, reason: not valid java name */
    public final int m3643getApiVersionpVg5ArA() {
        return this.apiVersion;
    }

    public final PageCloseReceipt getReceipt() {
        return this.receipt;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.receipt, this.apiVersion * 31);
    }

    /* renamed from: setApiVersion-WZ4Q5Ns, reason: not valid java name */
    public final void m3644setApiVersionWZ4Q5Ns(int i) {
        this.apiVersion = i;
    }

    public String toString() {
        return C3cJ.A0L(this.receipt, ", receipt=", C3cI.A0x("PageCloseReceiptEnvelope(apiVersion=", String.valueOf(BV4.A03(this.apiVersion))));
    }

    public /* synthetic */ PageCloseReceiptEnvelope(int i, PageCloseReceipt pageCloseReceipt, C06H c06h) {
        this(i, pageCloseReceipt);
    }
}
