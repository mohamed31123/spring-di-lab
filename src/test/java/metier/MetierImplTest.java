package metier;

import ma.gestion.dao.IDao;
import ma.gestion.metier.MetierImpl;
import org.junit.Assert;
import org.junit.Test;
public class MetierImplTest {

    @Test
    public void testCalcul() {
        IDao dao = new IDao() {
            @Override
            public double getValue() {
                return 10.0;
            }
        };

        // Création de l'instance de MetierImpl et injection manuelle de la dépendance
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        // Vérification que le calcul donne le résultat attendu
        double result = metier.calcul();
        Assert.assertEquals(20.0, result, 0.001);  // 10.0 * 2 = 20.0
    }
}