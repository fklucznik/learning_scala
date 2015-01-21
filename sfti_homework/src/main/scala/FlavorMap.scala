import java.awt.datatransfer._
import collection.mutable.Buffer
import scala.collection.JavaConversions._

/**
 * Created by frank on 1/20/15.
 */
object FlavorMap extends App {

  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]

  val natives: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)

  println(natives)

}
