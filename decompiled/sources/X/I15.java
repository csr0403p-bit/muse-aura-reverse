package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout$SavedState;

/* loaded from: classes6.dex */
public final class I15 implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int $t;

    public I15(int i) {
        this.$t = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                Toolbar.SavedState savedState = new Toolbar.SavedState(parcel, null);
                savedState.A00 = parcel.readInt();
                savedState.A01 = AnonymousClass002.A1L(parcel.readInt());
                return savedState;
            case 1:
                return new CoordinatorLayout.SavedState(parcel, null);
            case 2:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.A01;
                }
                throw C3cG.A0Q("superState must be null");
            case 3:
                return new Fragment.SavedState(parcel, null);
            case 4:
                RecyclerView.SavedState savedState2 = new RecyclerView.SavedState(parcel, null);
                savedState2.A00 = parcel.readParcelable(FTN.class.getClassLoader());
                return savedState2;
            case 5:
                return new BottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
            case 6:
                MaterialButton.SavedState savedState3 = new MaterialButton.SavedState(parcel, null);
                savedState3.getClass().getClassLoader();
                savedState3.A00 = BV7.A1Q(parcel.readInt());
                return savedState3;
            case 7:
                CheckableImageButton.SavedState savedState4 = new CheckableImageButton.SavedState(parcel, null);
                savedState4.A00 = BV7.A1Q(parcel.readInt());
                return savedState4;
            case 8:
                return new TextInputLayout$SavedState(parcel, null);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return new Toolbar.SavedState[i];
            case 1:
                return new CoordinatorLayout.SavedState[i];
            case 2:
                return new AbsSavedState[i];
            case 3:
                return new Fragment.SavedState[i];
            case 4:
                return new RecyclerView.SavedState[i];
            case 5:
                return new BottomSheetBehavior.SavedState[i];
            case 6:
                return new MaterialButton.SavedState[i];
            case 7:
                return new CheckableImageButton.SavedState[i];
            case 8:
                return new TextInputLayout$SavedState[i];
            default:
                return BV4.A1W();
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.$t) {
            case 0:
                Toolbar.SavedState savedState = new Toolbar.SavedState(parcel, classLoader);
                savedState.A00 = parcel.readInt();
                savedState.A01 = AnonymousClass002.A1L(parcel.readInt());
                return savedState;
            case 1:
                return new CoordinatorLayout.SavedState(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.A01;
                }
                throw C3cG.A0Q("superState must be null");
            case 3:
                return new Fragment.SavedState(parcel, classLoader);
            case 4:
                RecyclerView.SavedState savedState2 = new RecyclerView.SavedState(parcel, classLoader);
                if (classLoader == null) {
                    classLoader = FTN.class.getClassLoader();
                }
                savedState2.A00 = parcel.readParcelable(classLoader);
                return savedState2;
            case 5:
                return new BottomSheetBehavior.SavedState(parcel, classLoader);
            case 6:
                MaterialButton.SavedState savedState3 = new MaterialButton.SavedState(parcel, classLoader);
                if (classLoader == null) {
                    savedState3.getClass().getClassLoader();
                }
                savedState3.A00 = BV7.A1Q(parcel.readInt());
                return savedState3;
            case 7:
                CheckableImageButton.SavedState savedState4 = new CheckableImageButton.SavedState(parcel, classLoader);
                savedState4.A00 = BV7.A1Q(parcel.readInt());
                return savedState4;
            case 8:
                return new TextInputLayout$SavedState(parcel, classLoader);
            default:
                return null;
        }
    }
}
