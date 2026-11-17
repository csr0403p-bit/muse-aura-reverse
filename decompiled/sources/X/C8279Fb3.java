package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.Fb3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8279Fb3 extends ActionMode {
    public final Context A00;
    public final AbstractC8280Fb4 A01;

    @Override // android.view.ActionMode
    public final void finish() {
        this.A01.A00();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        if (abstractC8280Fb4 instanceof C8261Faj) {
            WeakReference<View> weakReference = ((C8261Faj) abstractC8280Fb4).A04;
            if (weakReference != null) {
                return AbstractC7607F5u.A0c(weakReference);
            }
            return null;
        }
        WeakReference<View> weakReference2 = ((C8258Fae) abstractC8280Fb4).A01;
        if (weakReference2 != null) {
            return AbstractC7607F5u.A0c(weakReference2);
        }
        return null;
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        Context context = this.A00;
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        return new MenuC8266Fao(context, abstractC8280Fb4 instanceof C8261Faj ? ((C8261Faj) abstractC8280Fb4).A02 : ((C8258Fae) abstractC8280Fb4).A03);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        return new C8253FaY(abstractC8280Fb4 instanceof C8261Faj ? ((C8261Faj) abstractC8280Fb4).A03.getContext() : ((C8258Fae) abstractC8280Fb4).A02);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        return (abstractC8280Fb4 instanceof C8261Faj ? ((C8261Faj) abstractC8280Fb4).A03 : ((C8258Fae) abstractC8280Fb4).A04.A09).A07;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.A01.A00;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        return (abstractC8280Fb4 instanceof C8261Faj ? ((C8261Faj) abstractC8280Fb4).A03 : ((C8258Fae) abstractC8280Fb4).A04.A09).A08;
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.A01.A01;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.A01.A01();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        return (abstractC8280Fb4 instanceof C8261Faj ? ((C8261Faj) abstractC8280Fb4).A03 : ((C8258Fae) abstractC8280Fb4).A04.A09).A09;
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        if (abstractC8280Fb4 instanceof C8261Faj) {
            C8261Faj c8261Faj = (C8261Faj) abstractC8280Fb4;
            c8261Faj.A03.setCustomView(view);
            c8261Faj.A04 = view != null ? BV4.A0q(view) : null;
        } else {
            C8258Fae c8258Fae = (C8258Fae) abstractC8280Fb4;
            c8258Fae.A04.A09.setCustomView(view);
            c8258Fae.A01 = BV4.A0q(view);
        }
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) throws Resources.NotFoundException {
        String string;
        Object obj;
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        if (abstractC8280Fb4 instanceof C8261Faj) {
            C8261Faj c8261Faj = (C8261Faj) abstractC8280Fb4;
            string = c8261Faj.A00.getString(i);
            obj = c8261Faj;
        } else {
            C8258Fae c8258Fae = (C8258Fae) abstractC8280Fb4;
            string = c8258Fae.A04.A01.getResources().getString(i);
            obj = c8258Fae;
        }
        (obj instanceof C8261Faj ? ((C8261Faj) obj).A03 : ((C8258Fae) obj).A04.A09).setSubtitle(string);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.A01.A00 = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) throws Resources.NotFoundException {
        String string;
        Object obj;
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        if (abstractC8280Fb4 instanceof C8261Faj) {
            C8261Faj c8261Faj = (C8261Faj) abstractC8280Fb4;
            string = c8261Faj.A00.getString(i);
            obj = c8261Faj;
        } else {
            C8258Fae c8258Fae = (C8258Fae) abstractC8280Fb4;
            string = c8258Fae.A04.A01.getResources().getString(i);
            obj = c8258Fae;
        }
        (obj instanceof C8261Faj ? ((C8261Faj) obj).A03 : ((C8258Fae) obj).A04.A09).setTitle(string);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        ActionBarContextView actionBarContextView;
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        if (abstractC8280Fb4 instanceof C8261Faj) {
            C8261Faj c8261Faj = (C8261Faj) abstractC8280Fb4;
            ((AbstractC8280Fb4) c8261Faj).A01 = z;
            actionBarContextView = c8261Faj.A03;
        } else {
            C8258Fae c8258Fae = (C8258Fae) abstractC8280Fb4;
            ((AbstractC8280Fb4) c8258Fae).A01 = z;
            actionBarContextView = c8258Fae.A04.A09;
        }
        actionBarContextView.setTitleOptional(z);
    }

    public C8279Fb3(Context context, AbstractC8280Fb4 abstractC8280Fb4) {
        this.A00 = context;
        this.A01 = abstractC8280Fb4;
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        ActionBarContextView actionBarContextView;
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        if (abstractC8280Fb4 instanceof C8261Faj) {
            actionBarContextView = ((C8261Faj) abstractC8280Fb4).A03;
        } else {
            actionBarContextView = ((C8258Fae) abstractC8280Fb4).A04.A09;
        }
        actionBarContextView.setSubtitle(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        ActionBarContextView actionBarContextView;
        AbstractC8280Fb4 abstractC8280Fb4 = this.A01;
        if (abstractC8280Fb4 instanceof C8261Faj) {
            actionBarContextView = ((C8261Faj) abstractC8280Fb4).A03;
        } else {
            actionBarContextView = ((C8258Fae) abstractC8280Fb4).A04.A09;
        }
        actionBarContextView.setTitle(charSequence);
    }
}
