# Blockchain Simulation Project

This project demonstrates a basic blockchain simulation, including wallet creation, transactions, and block mining. It uses an unspent transaction output (UTXO) model similar to Bitcoin. Below are the instructions to run the project, test the blockchain, and explore its functionality.

## Features

- Simple blockchain implementation with configurable block mining difficulty.
- Wallet creation for users.
- Fund transfers between wallets.
- UTXO model for tracking balances.
- RESTful API for interacting with the blockchain.
- Postman collection for easy endpoint testing.

## How to Run

### Prerequisites

- Java 17+
- Maven

### Steps to Run

1. **Import the Maven project**: Clone the repository and import it into your preferred IDE as a Maven project.
   
2. **Download the dependencies**: Use Maven to download and install the necessary dependencies.
   
3. **Configure mining difficulty**:
   - Open the `TestChain` class.
   - On line 16, you’ll find a parameter to configure the difficulty of mining blocks. This affects the time taken to generate each block.

4. **Test block generation**:
   - A loop is set up on line 47 of the `TestChain` class to generate 500 blocks for testing purposes.

5. **Run the project**: After configuring the project, simply run the `Main` class to start the blockchain simulation.

## API Endpoints

A set of RESTful endpoints have been created to interact with the blockchain. You can use the Postman collection, available in the `resources` folder, to test the following flow:

1. **Create a wallet for Alice**.
2. **Create a wallet for Bob**.
3. **Add funds to Alice's wallet**.
4. **Check balances**.
5. **Transfer funds from Alice to Bob**.
6. **Check balances again**.

Additionally, there is an endpoint to query a wallet by passing the owner's name.

### Postman Collection

You can find the exported Postman collection in the `resources` folder to easily test the API.

## Key Concepts

- **UTXO Model**: This project uses the UTXO model, where each transaction consumes outputs from previous transactions and generates new unspent outputs.
  
- **Pending Transactions**: Transactions remain in a pending state until they are added to a block through mining.

## Future Improvements

This project is designed as a simple demonstration. Here are some features that could be added to improve it:

- Detailed error handling.
- Transaction signing.
- Transaction querying by ID.
- Consistent validations and error messages.
- Database persistence for blocks and transactions.
- Improved project structure with well-defined data transfer objects (DTOs).
- Multi-threaded transaction handling for better performance.
- Data structures like Merkle Trees for efficient verification.

## License

This project is open-source and licensed under the [MIT License](LICENSE).
