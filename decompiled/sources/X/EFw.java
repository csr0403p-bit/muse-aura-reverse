package X;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes5.dex */
public abstract class EFw {
    public static Person A00(EFx eFx) {
        Person.Builder name = new Person.Builder().setName(eFx.A01);
        IconCompat iconCompat = eFx.A00;
        return name.setIcon(iconCompat != null ? EFo.A00(null, iconCompat) : null).setUri(eFx.A03).setKey(eFx.A02).setBot(eFx.A04).setImportant(eFx.A05).build();
    }

    public static EFx A01(Person person) {
        return new EFx(person.getIcon() != null ? EFo.A01(person.getIcon()) : null, person.getName(), person.getKey(), person.getUri(), person.isBot(), person.isImportant());
    }
}
