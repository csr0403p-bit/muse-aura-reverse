package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.facebook.aura.model.GenericListPresentationKt;

/* renamed from: X.CjY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC4003CjY implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                C4005Cja c4005Cja = (C4005Cja) this;
                Intent intent = c4005Cja.A01;
                if (intent != null) {
                    c4005Cja.A00.startActivityForResult(intent, 2);
                }
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains(GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_GENERIC) ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
