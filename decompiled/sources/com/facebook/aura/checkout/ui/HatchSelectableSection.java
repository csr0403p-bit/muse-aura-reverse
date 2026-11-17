package com.facebook.aura.checkout.ui;

import X.AHD;
import X.AnonymousClass005;
import X.C06H;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchSelectableSection {
    public static final int $stable = 0;
    public final String addRowTitle;
    public final String id;
    public final String label;
    public final Function0<Unit> onAddRow;
    public final G0U<HatchSelectableOption, Unit> onOptionEdit;
    public final G0U<HatchSelectableOption, Unit> onOptionMore;
    public final G0U<HatchSelectableOption, Unit> onSelect;
    public final AHD<HatchSelectableOption> options;
    public final String selectedId;

    public /* synthetic */ HatchSelectableSection(String str, AHD ahd, String str2, G0U g0u, String str3, String str4, Function0 function0, G0U g0u2, G0U g0u3, int i, C06H c06h) {
        this(str, ahd, str2, g0u, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : function0, (i & 128) != 0 ? null : g0u2, (i & 256) != 0 ? null : g0u3);
    }

    public final String getAddRowTitle() {
        return this.addRowTitle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Function0<Unit> getOnAddRow() {
        return this.onAddRow;
    }

    public final G0U<HatchSelectableOption, Unit> getOnOptionEdit() {
        return this.onOptionEdit;
    }

    public final G0U<HatchSelectableOption, Unit> getOnOptionMore() {
        return this.onOptionMore;
    }

    public final G0U<HatchSelectableOption, Unit> getOnSelect() {
        return this.onSelect;
    }

    public final AHD<HatchSelectableOption> getOptions() {
        return this.options;
    }

    public final String getSelectedId() {
        return this.selectedId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchSelectableSection(String str, AHD<HatchSelectableOption> ahd, String str2, G0U<? super HatchSelectableOption, Unit> g0u, String str3, String str4, Function0<Unit> function0, G0U<? super HatchSelectableOption, Unit> g0u2, G0U<? super HatchSelectableOption, Unit> g0u3) {
        AnonymousClass005.A0y(str, ahd, g0u);
        this.id = str;
        this.options = ahd;
        this.selectedId = str2;
        this.onSelect = g0u;
        this.label = str3;
        this.addRowTitle = str4;
        this.onAddRow = function0;
        this.onOptionMore = g0u2;
        this.onOptionEdit = g0u3;
    }
}
