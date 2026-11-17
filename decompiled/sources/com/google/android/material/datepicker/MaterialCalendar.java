package com.google.android.material.datepicker;

import X.AbstractC8060FRo;
import X.C79;
import X.C8157FWz;
import X.C8207FYz;
import X.C8j4;
import X.FSI;
import X.FSP;
import X.FZ0;
import X.FZ3;
import X.FZ6;
import X.FZ7;
import X.FZK;
import X.I0C;
import X.I0W;
import X.I0Y;
import X.RunnableC8090FSw;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.aura.R;
import com.google.android.material.button.MaterialButton;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public View A00;
    public View A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public CalendarConstraints A04;
    public Month A05;
    public Integer A06;
    public int A07;
    public C8157FWz A08;
    public static final Object A09 = "MONTHS_VIEW_GROUP_TAG";
    public static final Object A0B = "NAVIGATION_PREV_TAG";
    public static final Object A0A = "NAVIGATION_NEXT_TAG";
    public static final Object A0C = "SELECTOR_TOGGLE_TAG";

    public final void A00(Month month) {
        RecyclerView recyclerView = this.A02;
        FZ0 fz0 = (FZ0) recyclerView.A0F;
        int iA05 = fz0.A05(month);
        int iA052 = iA05 - fz0.A05(this.A05);
        boolean zA1V = C8j4.A1V(Math.abs(iA052), 3);
        boolean z = iA052 > 0;
        this.A05 = month;
        if (zA1V) {
            int i = iA05 + 3;
            if (z) {
                i = iA05 - 3;
            }
            recyclerView.A0o(i);
        }
        this.A02.post(new RunnableC8090FSw(this, iA05));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A07);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A04);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws IOException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        this.A07 = bundle.getInt("THEME_RES_ID_KEY");
        bundle.getParcelable("GRID_SELECTOR_KEY");
        this.A04 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.A05 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.A07);
        this.A08 = new C8157FWz(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.A04.A04;
        boolean zA00 = MaterialDatePicker.A00(contextThemeWrapper);
        int i = R.layout._name_removed__res_0x7f0d0297;
        int i2 = 0;
        if (zA00) {
            i = R.layout._name_removed__res_0x7f0d029c;
            i2 = 1;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        AbstractC8060FRo.A06(gridView, new I0C(this, 3));
        gridView.setAdapter((ListAdapter) new FZ3());
        gridView.setNumColumns(month.A02);
        gridView.setEnabled(false);
        this.A02 = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.A02.setLayoutManager(new FSP(this, i2, i2));
        this.A02.setTag("MONTHS_VIEW_GROUP_TAG");
        FZ0 fz0 = new FZ0(contextThemeWrapper, this.A04, new FZK(this));
        this.A02.setAdapter(fz0);
        contextThemeWrapper.getResources();
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.A03 = recyclerView;
        if (recyclerView != null) {
            recyclerView.A0V = true;
            recyclerView.setLayoutManager(new GridLayoutManager(3, 1));
            this.A03.setAdapter(new C8207FYz(this));
            this.A03.A0y(new FZ7(this));
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC8060FRo.A06(materialButton, new I0C(this, 4));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.A01 = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.A00 = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            this.A06 = C79.A00;
            this.A01.setVisibility(8);
            this.A00.setVisibility(0);
            A00(this.A05);
            materialButton.setText(this.A05.A01(viewInflate.getContext()));
            this.A02.A10(new FZ6(materialButton, this, fz0));
            materialButton.setOnClickListener(new I0W(this, 6));
            viewFindViewById2.setOnClickListener(new I0Y(3, this, fz0));
            viewFindViewById.setOnClickListener(new I0Y(4, this, fz0));
        }
        if (!MaterialDatePicker.A00(contextThemeWrapper)) {
            new FSI().A05(this.A02);
        }
        this.A02.A0o(fz0.A05(this.A05));
        return viewInflate;
    }
}
