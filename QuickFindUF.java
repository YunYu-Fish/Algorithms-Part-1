public class QuickFindUF{
  //声明一个名为id的int型的数组类型成员，是该类的一个私有成员
  private int[] id;

  public QuickFindUF(int N){
    id = new int[];
    for(int i=0; i<N; i++){
      id[i]=i;
    }
  }

  public boolean connected(int p, int q){
    return id[p] == id[q];
  }

  public void union(int p, int q){
    int pid = id[p];
    int qid = id[q];
    for(int i=0; i<id.length;i++){
      if(id[p]==pid){
        id[i]=qid;
      }
    }
  }
}
