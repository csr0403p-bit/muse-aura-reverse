package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.FaR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8249FaR implements InterfaceMenuC8340FcD {
    public static final int[] A0O = {1, 4, 5, 3, 2, 0};
    public Drawable A01;
    public View A02;
    public InterfaceC8322Fbo A03;
    public C8252FaX A04;
    public CharSequence A05;
    public ArrayList<C8252FaX> A06;
    public ArrayList<C8252FaX> A07;
    public ArrayList<C8252FaX> A08;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0E;
    public ArrayList<C8252FaX> A0G;
    public boolean A0K;
    public final Context A0M;
    public final Resources A0N;
    public int A00 = 0;
    public boolean A0D = false;
    public boolean A0J = false;
    public boolean A0L = false;
    public boolean A0I = false;
    public ArrayList<C8252FaX> A0F = C3cG.A0h();
    public CopyOnWriteArrayList<WeakReference<InterfaceC8291FbF>> A09 = new CopyOnWriteArrayList<>();
    public boolean A0H = false;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/FaX;>;ILandroid/view/KeyEvent;)V */
    private final void A02(KeyEvent keyEvent, List list, int i) {
        char numericShortcut;
        int numericModifiers;
        boolean zA0F = A0F();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList<C8252FaX> arrayList = this.A07;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8252FaX c8252FaXA0g = AbstractC7607F5u.A0g(arrayList, i2);
                if (c8252FaXA0g.hasSubMenu()) {
                    ((C8249FaR) c8252FaXA0g.getSubMenu()).A02(keyEvent, list, i);
                }
                if (zA0F) {
                    numericShortcut = c8252FaXA0g.getAlphabeticShortcut();
                    numericModifiers = c8252FaXA0g.getAlphabeticModifiers();
                } else {
                    numericShortcut = c8252FaXA0g.getNumericShortcut();
                    numericModifiers = c8252FaXA0g.getNumericModifiers();
                }
                if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (zA0F && numericShortcut == '\b' && i == 67)) && c8252FaXA0g.isEnabled()) {
                        list.add(c8252FaXA0g);
                    }
                }
            }
        }
    }

    public final void A06() {
        this.A0D = false;
        if (this.A0J) {
            this.A0J = false;
            A0D(this.A0L);
        }
    }

    public final void clearHeader() {
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        A0D(false);
    }

    @Override // android.view.Menu
    public final void close() {
        A0C(true);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<C8252FaX> arrayList = this.A07;
            if (AbstractC7607F5u.A0g(arrayList, i2).getGroupId() == i) {
                if (i2 >= 0) {
                    int iA0I = AbstractC7607F5u.A0I(arrayList, i2);
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i3 >= iA0I || AbstractC7607F5u.A0g(arrayList, i2).getGroupId() != i) {
                            break;
                        }
                        if (i2 < arrayList.size()) {
                            arrayList.remove(i2);
                        }
                        i3 = i4;
                    }
                    A0D(true);
                    return;
                }
                return;
            }
        }
    }

    private final C8252FaX A00(KeyEvent keyEvent, int i) {
        ArrayList<C8252FaX> arrayList = this.A0F;
        arrayList.clear();
        A02(keyEvent, arrayList, i);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return AbstractC7607F5u.A0g(arrayList, 0);
        }
        boolean zA0F = A0F();
        for (int i2 = 0; i2 < size; i2++) {
            C8252FaX c8252FaXA0g = AbstractC7607F5u.A0g(arrayList, i2);
            char alphabeticShortcut = zA0F ? c8252FaXA0g.getAlphabeticShortcut() : c8252FaXA0g.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zA0F && alphabeticShortcut == '\b' && i == 67))) {
                return c8252FaXA0g;
            }
        }
        return null;
    }

    private final C8252FaX A01(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = A0O;
            if (i5 < 6) {
                int i6 = (i3 & 65535) | (iArr[i5] << 16);
                C8252FaX c8252FaX = new C8252FaX(this, charSequence, i, i2, i3, i6, this.A00);
                ArrayList<C8252FaX> arrayList = this.A07;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                        break;
                    }
                    if (AbstractC7607F5u.A0g(arrayList, size).A0Q <= i6) {
                        i4 = size + 1;
                        break;
                    }
                }
                arrayList.add(i4, c8252FaX);
                A0D(true);
                return c8252FaX;
            }
        }
        throw C60O.A0i("order does not contain a valid category.");
    }

    public final C8249FaR A03() {
        return this instanceof SubMenuC8248FaQ ? ((SubMenuC8248FaQ) this).A00.A03() : this;
    }

    public final ArrayList<C8252FaX> A04() {
        boolean z = this.A0B;
        ArrayList<C8252FaX> arrayList = this.A0G;
        if (z) {
            arrayList.clear();
            ArrayList<C8252FaX> arrayList2 = this.A07;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C8252FaX c8252FaXA0g = AbstractC7607F5u.A0g(arrayList2, i);
                if (c8252FaXA0g.isVisible()) {
                    arrayList.add(c8252FaXA0g);
                }
            }
            this.A0B = false;
            this.A0A = true;
        }
        return arrayList;
    }

    public final void A07() {
        if (this.A0D) {
            return;
        }
        this.A0D = true;
        this.A0J = false;
        this.A0L = false;
    }

    public final void A08(Context context, InterfaceC8291FbF interfaceC8291FbF) {
        this.A09.add(BV4.A0q(interfaceC8291FbF));
        interfaceC8291FbF.ANd(context, this);
        this.A0A = true;
    }

    public final void A09(Bundle bundle) {
        String strA0S;
        MenuItem menuItemFindItem;
        int itemId;
        if (this instanceof SubMenuC8248FaQ) {
            C8252FaX c8252FaX = ((SubMenuC8248FaQ) this).A01;
            strA0S = (c8252FaX == null || (itemId = c8252FaX.getItemId()) == 0) ? null : FGI.A0S("android:menu:actionviewstates", ":", itemId);
        } else {
            strA0S = "android:menu:actionviewstates";
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(strA0S);
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C8249FaR) item.getSubMenu()).A09(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void A0B(InterfaceC8291FbF interfaceC8291FbF) {
        CopyOnWriteArrayList<WeakReference<InterfaceC8291FbF>> copyOnWriteArrayList = this.A09;
        Iterator<WeakReference<InterfaceC8291FbF>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC8291FbF> next = it.next();
            InterfaceC8291FbF interfaceC8291FbF2 = next.get();
            if (interfaceC8291FbF2 == null || interfaceC8291FbF2 == interfaceC8291FbF) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    public final void A0C(boolean z) {
        if (this.A0I) {
            return;
        }
        this.A0I = true;
        CopyOnWriteArrayList<WeakReference<InterfaceC8291FbF>> copyOnWriteArrayList = this.A09;
        Iterator<WeakReference<InterfaceC8291FbF>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC8291FbF> next = it.next();
            InterfaceC8291FbF interfaceC8291FbF = next.get();
            if (interfaceC8291FbF == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                interfaceC8291FbF.ASE(this, z);
            }
        }
        this.A0I = false;
    }

    public final void A0D(boolean z) {
        if (this.A0D) {
            this.A0J = true;
            if (z) {
                this.A0L = true;
                return;
            }
            return;
        }
        if (z) {
            this.A0B = true;
            this.A0A = true;
        }
        CopyOnWriteArrayList<WeakReference<InterfaceC8291FbF>> copyOnWriteArrayList = this.A09;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        A07();
        Iterator<WeakReference<InterfaceC8291FbF>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC8291FbF> next = it.next();
            InterfaceC8291FbF interfaceC8291FbF = next.get();
            if (interfaceC8291FbF == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                interfaceC8291FbF.Ahy();
            }
        }
        A06();
    }

    public final boolean A0E() {
        return this instanceof SubMenuC8248FaQ ? ((SubMenuC8248FaQ) this).A00.A0E() : this.A0H;
    }

    public final boolean A0F() {
        return this instanceof SubMenuC8248FaQ ? ((SubMenuC8248FaQ) this).A00.A0F() : this.A0K;
    }

    public final boolean A0G() {
        return this instanceof SubMenuC8248FaQ ? ((SubMenuC8248FaQ) this).A00.A0G() : this.A0E;
    }

    public boolean A0H(MenuItem menuItem, C8249FaR c8249FaR) {
        InterfaceC8322Fbo interfaceC8322Fbo = this.A03;
        return interfaceC8322Fbo != null && interfaceC8322Fbo.AU9(menuItem, c8249FaR);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035 A[PHI: r6
  0x0035: PHI (r6v11 boolean) = (r6v3 boolean), (r6v13 boolean) binds: [B:50:0x00ac, B:18:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0I(android.view.MenuItem r9, X.InterfaceC8291FbF r10, int r11) {
        /*
            r8 = this;
            X.FaX r9 = (X.C8252FaX) r9
            r3 = 0
            if (r9 == 0) goto Ldd
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto Ldd
            android.view.MenuItem$OnMenuItemClickListener r0 = r9.A09
            r7 = 1
            if (r0 == 0) goto Laf
            boolean r0 = r0.onMenuItemClick(r9)
            if (r0 == 0) goto Laf
        L16:
            X.Fbt r6 = r9.A0D
            r5 = 1
            if (r6 == 0) goto L27
            r0 = r6
            X.Fb9 r0 = (X.ActionProviderVisibilityListenerC8285Fb9) r0
            android.view.ActionProvider r0 = r0.A01
            boolean r0 = r0.hasSubMenu()
            r2 = 1
            if (r0 != 0) goto L28
        L27:
            r2 = 0
        L28:
            boolean r0 = r9.A01()
            if (r0 == 0) goto L39
            boolean r6 = r9.expandActionView()
            r6 = r6 | r7
            if (r6 == 0) goto L38
        L35:
            r8.A0C(r5)
        L38:
            return r6
        L39:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L49
            if (r2 != 0) goto L49
            r0 = r11 & 1
            if (r0 != 0) goto L48
            r8.A0C(r5)
        L48:
            return r7
        L49:
            r0 = r11 & 4
            if (r0 != 0) goto L50
            r8.A0C(r3)
        L50:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L6a
            android.content.Context r0 = r8.A0M
            X.FaQ r1 = new X.FaQ
            r1.<init>(r0)
            r1.A00 = r8
            r1.A01 = r9
            r9.A0C = r1
            java.lang.CharSequence r0 = r9.getTitle()
            r1.setHeaderTitle(r0)
        L6a:
            android.view.SubMenu r4 = r9.getSubMenu()
            X.FaQ r4 = (X.SubMenuC8248FaQ) r4
            if (r2 == 0) goto L79
            X.Fb9 r6 = (X.ActionProviderVisibilityListenerC8285Fb9) r6
            android.view.ActionProvider r0 = r6.A01
            r0.onPrepareSubMenu(r4)
        L79:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<X.FbF>> r3 = r8.A09
            boolean r0 = r3.isEmpty()
            r6 = 0
            if (r0 != 0) goto Lab
            if (r10 == 0) goto L88
            boolean r6 = r10.AWM(r4)
        L88:
            java.util.Iterator r2 = r3.iterator()
        L8c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r1 = r2.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.FbF r0 = (X.InterfaceC8291FbF) r0
            if (r0 != 0) goto La4
            r3.remove(r1)
            goto L8c
        La4:
            if (r6 != 0) goto L8c
            boolean r6 = r0.AWM(r4)
            goto L8c
        Lab:
            r6 = r6 | r7
            if (r6 != 0) goto L38
            goto L35
        Laf:
            X.FaR r2 = r9.A0B
            boolean r0 = r2.A0H(r9, r2)
            if (r0 != 0) goto L16
            android.content.Intent r1 = r9.A06
            if (r1 == 0) goto Lca
            android.content.Context r0 = r2.A0M     // Catch: android.content.ActivityNotFoundException -> Lc2
            r0.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> Lc2
            goto L16
        Lc2:
            r2 = move-exception
            java.lang.String r1 = "MenuItemImpl"
            java.lang.String r0 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r1, r0, r2)
        Lca:
            X.Fbt r0 = r9.A0D
            if (r0 == 0) goto Lda
            X.Fb9 r0 = (X.ActionProviderVisibilityListenerC8285Fb9) r0
            android.view.ActionProvider r0 = r0.A01
            boolean r0 = r0.onPerformDefaultAction()
            if (r0 == 0) goto Lda
            goto L16
        Lda:
            r7 = 0
            goto L16
        Ldd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8249FaR.A0I(android.view.MenuItem, X.FbF, int):boolean");
    }

    public final boolean A0J(C8252FaX c8252FaX) {
        if (this instanceof SubMenuC8248FaQ) {
            return ((SubMenuC8248FaQ) this).A00.A0J(c8252FaX);
        }
        CopyOnWriteArrayList<WeakReference<InterfaceC8291FbF>> copyOnWriteArrayList = this.A09;
        boolean zA6W = false;
        if (copyOnWriteArrayList.isEmpty() || this.A04 != c8252FaX) {
            return false;
        }
        A07();
        Iterator<WeakReference<InterfaceC8291FbF>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC8291FbF> next = it.next();
            InterfaceC8291FbF interfaceC8291FbF = next.get();
            if (interfaceC8291FbF == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                zA6W = interfaceC8291FbF.A6W(c8252FaX);
                if (zA6W) {
                    break;
                }
            }
        }
        A06();
        if (!zA6W) {
            return zA6W;
        }
        this.A04 = null;
        return zA6W;
    }

    public final boolean A0K(C8252FaX c8252FaX) {
        if (this instanceof SubMenuC8248FaQ) {
            return ((SubMenuC8248FaQ) this).A00.A0K(c8252FaX);
        }
        CopyOnWriteArrayList<WeakReference<InterfaceC8291FbF>> copyOnWriteArrayList = this.A09;
        boolean zABB = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        A07();
        Iterator<WeakReference<InterfaceC8291FbF>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC8291FbF> next = it.next();
            InterfaceC8291FbF interfaceC8291FbF = next.get();
            if (interfaceC8291FbF == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                zABB = interfaceC8291FbF.ABB(c8252FaX);
                if (zABB) {
                    break;
                }
            }
        }
        A06();
        if (!zABB) {
            return zABB;
        }
        this.A04 = c8252FaX;
        return zABB;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return A01(this.A0N.getString(i), 0, 0, 0);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.A0M.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int iA0I = AbstractC7609F5w.A0I(listQueryIntentActivityOptions);
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < iA0I; i5++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(((PackageItemInfo) ((ComponentInfo) activityInfo).applicationInfo).packageName, ((PackageItemInfo) activityInfo).name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return iA0I;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.A0N.getString(i));
    }

    @Override // android.view.Menu
    public final void clear() {
        C8252FaX c8252FaX = this.A04;
        if (c8252FaX != null) {
            A0J(c8252FaX);
        }
        this.A07.clear();
        A0D(true);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return this.A07.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (!this.A0C) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (!AbstractC7607F5u.A0g(this.A07, i).isVisible()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList<C8252FaX> arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8252FaX c8252FaXA0g = AbstractC7607F5u.A0g(arrayList, i2);
            if (c8252FaXA0g.getGroupId() == i) {
                c8252FaXA0g.A02 = (z2 ? 4 : 0) | (c8252FaXA0g.A02 & (-5));
                c8252FaXA0g.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        if (this instanceof SubMenuC8248FaQ) {
            ((SubMenuC8248FaQ) this).A00.setGroupDividerEnabled(z);
        } else {
            this.A0H = z;
        }
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList<C8252FaX> arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8252FaX c8252FaXA0g = AbstractC7607F5u.A0g(arrayList, i2);
            if (c8252FaXA0g.getGroupId() == i) {
                c8252FaXA0g.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList<C8252FaX> arrayList = this.A07;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C8252FaX c8252FaXA0g = AbstractC7607F5u.A0g(arrayList, i2);
            if (c8252FaXA0g.getGroupId() == i) {
                int i3 = c8252FaXA0g.A02;
                int iA06 = AbstractC7609F5w.A06(z ? 1 : 0) | (i3 & (-9));
                c8252FaXA0g.A02 = iA06;
                if (i3 != iA06) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            A0D(true);
        }
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        if (this instanceof SubMenuC8248FaQ) {
            ((SubMenuC8248FaQ) this).A00.setQwertyMode(z);
        } else {
            this.A0K = z;
            A0D(false);
        }
    }

    @Override // android.view.Menu
    public final int size() {
        return this.A07.size();
    }

    public C8249FaR(Context context) {
        this.A0M = context;
        Resources resources = context.getResources();
        this.A0N = resources;
        this.A07 = C3cG.A0h();
        this.A0G = C3cG.A0h();
        this.A0B = true;
        this.A06 = C3cG.A0h();
        this.A08 = C3cG.A0h();
        this.A0A = true;
        this.A0E = resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(this.A0M).shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public final void A05() {
        ArrayList<C8252FaX> arrayListA04 = A04();
        if (this.A0A) {
            CopyOnWriteArrayList<WeakReference<InterfaceC8291FbF>> copyOnWriteArrayList = this.A09;
            Iterator<WeakReference<InterfaceC8291FbF>> it = copyOnWriteArrayList.iterator();
            boolean zABf = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC8291FbF> next = it.next();
                InterfaceC8291FbF interfaceC8291FbF = next.get();
                if (interfaceC8291FbF == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    zABf |= interfaceC8291FbF.ABf();
                }
            }
            ArrayList<C8252FaX> arrayList = this.A06;
            arrayList.clear();
            if (zABf) {
                ArrayList<C8252FaX> arrayList2 = this.A08;
                arrayList2.clear();
                int size = arrayListA04.size();
                for (int i = 0; i < size; i++) {
                    C8252FaX c8252FaXA0g = AbstractC7607F5u.A0g(arrayListA04, i);
                    ArrayList<C8252FaX> arrayList3 = arrayList2;
                    if ((c8252FaXA0g.A02 & 32) == 32) {
                        arrayList3 = arrayList;
                    }
                    arrayList3.add(c8252FaXA0g);
                }
            } else {
                ArrayList<C8252FaX> arrayList4 = this.A08;
                arrayList4.clear();
                arrayList4.addAll(A04());
            }
            this.A0A = false;
        }
    }

    public final void A0A(Bundle bundle) {
        String strA0S;
        int itemId;
        int size = size();
        SparseArray<? extends Parcelable> sparseArrayA0B = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArrayA0B == null) {
                    sparseArrayA0B = BV4.A0B();
                }
                actionView.saveHierarchyState(sparseArrayA0B);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C8249FaR) item.getSubMenu()).A0A(bundle);
            }
        }
        if (sparseArrayA0B != null) {
            if (this instanceof SubMenuC8248FaQ) {
                C8252FaX c8252FaX = ((SubMenuC8248FaQ) this).A01;
                strA0S = (c8252FaX == null || (itemId = c8252FaX.getItemId()) == 0) ? null : FGI.A0S("android:menu:actionviewstates", ":", itemId);
            } else {
                strA0S = "android:menu:actionviewstates";
            }
            bundle.putSparseParcelableArray(strA0S, sparseArrayA0B);
        }
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem menuItemA0g = AbstractC7607F5u.A0g(this.A07, i2);
            if (menuItemA0g.getItemId() == i || (menuItemA0g.hasSubMenu() && (menuItemA0g = menuItemA0g.getSubMenu().findItem(i)) != null)) {
                return menuItemA0g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return AnonymousClass002.A1X(A00(keyEvent, i));
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return A0I(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C8252FaX c8252FaXA00 = A00(keyEvent, i);
        boolean zA0I = c8252FaXA00 != null ? A0I(c8252FaXA00, null, i2) : false;
        if ((i2 & 2) != 0) {
            A0C(true);
        }
        return zA0I;
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<C8252FaX> arrayList = this.A07;
            if (AbstractC7607F5u.A0g(arrayList, i2).getItemId() == i) {
                if (i2 < 0 || i2 >= arrayList.size()) {
                    return;
                }
                arrayList.remove(i2);
                A0D(true);
                return;
            }
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return A01(charSequence, 0, 0, 0);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A01(charSequence, i, i2, i3);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.A0N.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return A01(this.A0N.getString(i4), i, i2, i3);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C8252FaX c8252FaXA01 = A01(charSequence, i, i2, i3);
        SubMenuC8248FaQ subMenuC8248FaQ = new SubMenuC8248FaQ(this.A0M);
        subMenuC8248FaQ.A00 = this;
        subMenuC8248FaQ.A01 = c8252FaXA01;
        c8252FaXA01.A0C = subMenuC8248FaQ;
        subMenuC8248FaQ.setHeaderTitle(c8252FaXA01.getTitle());
        return subMenuC8248FaQ;
    }
}
