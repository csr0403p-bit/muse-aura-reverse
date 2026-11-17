package com.facebook.aura.file.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.file.spreadsheet.SpreadsheetSheet;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SpreadsheetContentViewKt$SpreadsheetContent$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $contentBottomPadding;
    public final /* synthetic */ ExternalFileSource $externalSource;
    public final /* synthetic */ String $mimeType;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $previewTruncated;
    public final /* synthetic */ AHD<SpreadsheetSheet> $sheets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpreadsheetContentViewKt$SpreadsheetContent$3(AHD<SpreadsheetSheet> ahd, boolean z, ExternalFileSource externalFileSource, String str, BRg bRg, float f, int i, int i2) {
        super(2);
        this.$sheets = ahd;
        this.$previewTruncated = z;
        this.$externalSource = externalFileSource;
        this.$mimeType = str;
        this.$modifier = bRg;
        this.$contentBottomPadding = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        SpreadsheetContentViewKt.m929SpreadsheetContentHYR8e34(this.$sheets, this.$previewTruncated, this.$externalSource, this.$mimeType, this.$modifier, this.$contentBottomPadding, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
