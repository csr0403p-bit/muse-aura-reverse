package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: X.Fan, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8265Fan implements InterfaceC8306FbY {
    public final Context A00;
    public final ActionMode.Callback A01;
    public final ArrayList<C8279Fb3> A03 = C3cG.A0h();
    public final DQZ<Menu, Menu> A02 = new DQZ<>(0);

    public final C8279Fb3 A00(AbstractC8280Fb4 abstractC8280Fb4) {
        ArrayList<C8279Fb3> arrayList = this.A03;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C8279Fb3 c8279Fb3 = arrayList.get(i);
            if (c8279Fb3 != null && c8279Fb3.A01 == abstractC8280Fb4) {
                return c8279Fb3;
            }
        }
        C8279Fb3 c8279Fb32 = new C8279Fb3(this.A00, abstractC8280Fb4);
        arrayList.add(c8279Fb32);
        return c8279Fb32;
    }

    @Override // X.InterfaceC8306FbY
    public final boolean ARg(MenuItem menuItem, AbstractC8280Fb4 abstractC8280Fb4) {
        return this.A01.onActionItemClicked(A00(abstractC8280Fb4), new MenuItemC8255Fab(this.A00, (InterfaceMenuItemC8267Fap) menuItem));
    }

    @Override // X.InterfaceC8306FbY
    public final boolean AST(Menu menu, AbstractC8280Fb4 abstractC8280Fb4) {
        ActionMode.Callback callback = this.A01;
        C8279Fb3 c8279Fb3A00 = A00(abstractC8280Fb4);
        DQZ<Menu, Menu> dqz = this.A02;
        Menu menuC8266Fao = dqz.get(menu);
        if (menuC8266Fao == null) {
            menuC8266Fao = new MenuC8266Fao(this.A00, (InterfaceMenuC8340FcD) menu);
            dqz.put(menu, menuC8266Fao);
        }
        return callback.onCreateActionMode(c8279Fb3A00, menuC8266Fao);
    }

    @Override // X.InterfaceC8306FbY
    public final void ASW(AbstractC8280Fb4 abstractC8280Fb4) {
        this.A01.onDestroyActionMode(A00(abstractC8280Fb4));
    }

    @Override // X.InterfaceC8306FbY
    public final boolean AUt(Menu menu, AbstractC8280Fb4 abstractC8280Fb4) {
        ActionMode.Callback callback = this.A01;
        C8279Fb3 c8279Fb3A00 = A00(abstractC8280Fb4);
        DQZ<Menu, Menu> dqz = this.A02;
        Menu menuC8266Fao = dqz.get(menu);
        if (menuC8266Fao == null) {
            menuC8266Fao = new MenuC8266Fao(this.A00, (InterfaceMenuC8340FcD) menu);
            dqz.put(menu, menuC8266Fao);
        }
        return callback.onPrepareActionMode(c8279Fb3A00, menuC8266Fao);
    }

    public C8265Fan(Context context, ActionMode.Callback callback) {
        this.A00 = context;
        this.A01 = callback;
    }
}
